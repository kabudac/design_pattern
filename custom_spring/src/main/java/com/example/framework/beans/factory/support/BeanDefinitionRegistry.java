package com.example.framework.beans.factory.support;

import com.example.framework.beans.BeanDefinition;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 16:14
 * @Description: 注册表对象 注册bean
 */
public interface BeanDefinitionRegistry {
    /**
     * 注册{@link BeanDefinition}对象到注册表中
     *
     * @param beanName       bean名字
     * @param beanDefinition bean封装信息
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);


    /**
     * 删除{@link BeanDefinition}对象
     *
     * @param beanName bean名字
     * @throws Exception 异常
     */
    void removeBeanDefinition(String beanName) throws Exception;

    /**
     * 获取{@link BeanDefinition}对象
     *
     * @param beanName bean名字
     * @return {@link BeanDefinition}
     * @throws Exception 异常
     */
    BeanDefinition getBeanDefinition(String beanName) throws Exception;


    /**
     * 是否包含{@link BeanDefinition}对象
     *
     * @param beanName bean名字
     * @return {@link Boolean}
     */
    boolean containsBeanDefinition(String beanName);

    /**
     * 获取{@link BeanDefinition}对象数量
     *
     * @return int 数量
     */
    int getBeanDefinitionCount();

    /**
     * 获得{@link BeanDefinition}对象 名称
     *
     * @return {@link String[]} 名称列表
     */
    String[] getBeanDefinitionNames();
}
