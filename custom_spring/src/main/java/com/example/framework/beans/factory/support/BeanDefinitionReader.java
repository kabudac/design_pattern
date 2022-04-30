package com.example.framework.beans.factory.support;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 16:37
 * @Description: 用于解析配置文件
 */
public interface BeanDefinitionReader {
    /**
     * 获得注册表对象
     *
     * @return {@link BeanDefinitionRegistry}
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 加载配置文件并在注册表中注册
     *
     * @param configLocation 配置位置
     * @throws Exception 异常
     */
    void loadBeanDefinitions(String configLocation) throws Exception;
}
