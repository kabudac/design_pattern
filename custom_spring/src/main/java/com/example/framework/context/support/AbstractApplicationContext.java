package com.example.framework.context.support;

import com.example.framework.beans.factory.support.BeanDefinitionReader;
import com.example.framework.beans.factory.support.BeanDefinitionRegistry;
import com.example.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 17:21
 * @Description: 作为ApplicationContext子类 非延时加载。
 * 申明BeanDefinitionReader类型的变量，进行xml解析 符合单一职责原则。
 * BeanDefinitionReader类型的对象创建交由子类实现，因为只有子类明确到底创建BeanDefinitionReader哪儿个子实现类对象。
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    protected BeanDefinitionReader beanDefinitionReader;

    /**
     * 用来存储beans的单例容器  key:id值   value: bean对象
     */
    protected Map<String, Object> singletonObjects = new HashMap<>();

    protected String configLocation;

    @Override
    public void refresh() throws Exception {
        //解析BeanDefinition对象
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        //初始化bean
        finishBeanInitialization();
    }

    private void finishBeanInitialization() throws Exception {
        //获取BeanDefinition对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        for (String beanName : registry.getBeanDefinitionNames()) {
            //生成bean对象
            getBean(beanName);
        }
    }
}
