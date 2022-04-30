package com.example.framework.beans.factory;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 17:14
 * @Description: IOC容器父接口
 */
public interface BeanFactory {

    /**
     * 获取Bean对象
     *
     * @param name 名字
     * @return {@link Object}
     * @throws Exception 异常
     */
    Object getBean(String name) throws Exception;

    /**
     * 获取Bean对象
     *
     * @param name  名字
     * @param clazz class类型
     * @return {@link T} bean 类型
     * @throws Exception 异常
     */
    <T> T getBean(String name, Class<? extends T> clazz) throws Exception;
}
