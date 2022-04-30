package com.example.framework.context;

import com.example.framework.beans.factory.BeanFactory;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 17:18
 * @Description: 定义非延时加载功能
 */
public interface ApplicationContext extends BeanFactory{

    /**
     * 加载配置文件
     * 根据注册表中的BeanDefinition对象封装的数据创建bean对象
     *
     * @throws Exception 异常
     */
    void refresh() throws Exception;
}
