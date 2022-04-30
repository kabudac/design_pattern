package com.example.framework.beans.factory.xml;

import com.example.framework.beans.BeanDefinition;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import com.example.framework.beans.MutablePropertyValues;
import com.example.framework.beans.PropertyValue;
import com.example.framework.beans.factory.support.BeanDefinitionReader;
import com.example.framework.beans.factory.support.BeanDefinitionRegistry;
import com.example.framework.beans.factory.support.SimpleBeanDefinitionRegistry;

import java.io.File;
import java.io.InputStream;
import java.util.List;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 16:39
 * @Description: 针对xml配置文件类型进行解析
 */
public class XmlBeanDefinitionReader implements BeanDefinitionReader {
    /**
     * 申明注册表对象 符合迪米特法则
     */
    private BeanDefinitionRegistry registry;

    public XmlBeanDefinitionReader(){
        registry = new SimpleBeanDefinitionRegistry();
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public void loadBeanDefinitions(String configLocation) throws Exception {
        //使用dom4j对xml进行解析
        SAXReader reader = new SAXReader();

        //获取类路径下的配置文件
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(configLocation);
        Document document = reader.read(is);
        //根据Document对象获取根标签对象(beans)
        Element rootElement = document.getRootElement();

        //获取根标签下的所有bean标签对象
        List<Element> beanElements = rootElement.elements("bean");
        for (Element beanElement : beanElements) {
            String id = beanElement.attributeValue("id");
            String className = beanElement.attributeValue("class");
            //将属性装配到BeanDefinition对象中
            BeanDefinition beanDefinition = new BeanDefinition(id,className);

            //获取bean标签下所有的property标签对象
            List<Element> propertyElements = beanElement.elements("property");

            MutablePropertyValues propertyValues = new MutablePropertyValues();

            for (Element propertyElement : propertyElements) {
                String name = propertyElement.attributeValue("name");
                String ref = propertyElement.attributeValue("ref");
                String value = propertyElement.attributeValue("value");

                PropertyValue propertyValue = new PropertyValue(name, ref, value);
                propertyValues.addPropertyValue(propertyValue);
            }
            //将MutablePropertyValues 对象封装到BeanDefinition对象中
            beanDefinition.setPropertyValues(propertyValues);

            //注册BeanDefinition 对象
            registry.registerBeanDefinition(id, beanDefinition);
        }
    }
}
