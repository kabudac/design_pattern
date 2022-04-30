package com.example.framework.context.support;

import com.example.framework.utils.StringUtils;
import com.example.framework.beans.BeanDefinition;
import com.example.framework.beans.PropertyValue;
import com.example.framework.beans.factory.xml.XmlBeanDefinitionReader;

import java.lang.reflect.Method;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 17:40
 * @Description: IOC容器具体的子实现类 用于加载类路径下的xml配置文件
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation = configLocation;
        //构建解析器对象
        beanDefinitionReader = new XmlBeanDefinitionReader();
        try {
            this.refresh();
        } catch (Exception ignored) {
        }
    }

    @Override
    public Object getBean(String name) throws Exception {
        //如果容器中包含该bean对象 直接返回
        Object obj = singletonObjects.get(name);
        if (obj != null) {
            return obj;
        }

        //获取BeanDefinition对象
        BeanDefinition beanDefinition = beanDefinitionReader.getRegistry().getBeanDefinition(name);
        String className = beanDefinition.getClassName();

        //通过反射创建对象
        Class<?> clazz = Class.forName(className);
        Object bean = clazz.newInstance();

        //注入依赖
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues()) {
            String propertyName = propertyValue.getName();
            String ref = propertyValue.getRef();
            String value = propertyValue.getValue();

            if (null != ref && !"".equals(ref)) {
                Object refBean = getBean(ref);
                //拼接setter方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                //反射获取方法对象

                // Method[] methods = clazz.getMethods();
                // for (Method method : methods) {
                //     if (method.getName().equals(methodName)) {
                //         //执行该setter方法
                //         method.invoke(bean, refBean);
                //         break;
                //     }
                // }

                Class<?>[] interfaces = refBean.getClass().getInterfaces();
                Method method = clazz.getMethod(methodName, interfaces);
                method.invoke(bean, refBean);
            }

            if (null != value && !"".equals(value)) {
                //拼接方法名
                String methodName = StringUtils.getSetterMethodByFieldName(propertyName);
                Method method = clazz.getMethod(methodName, String.class);
                method.invoke(bean, value);
            }
        }

        //返回之前 将该对象存储到单例容器中
        singletonObjects.put(name, bean);

        return bean;
    }

    @Override
    public <T> T getBean(String name, Class<? extends T> clazz) throws Exception {
        Object bean = getBean(name);
        if (bean == null) {
            //直接返回
            return null;
        }
        return clazz.cast(bean);
    }
}
