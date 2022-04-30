package com.example.framework.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 16:07
 * @Description: 用来封装bean信息 包含
 * id: bean对象名称
 * class: 需要交由spring管理的类的全类名
 * property: 子标签
 */
@Getter
@Setter
@AllArgsConstructor
public class BeanDefinition {
    private String id;
    private String className;
    private MutablePropertyValues propertyValues;

    public BeanDefinition() {
        propertyValues = new MutablePropertyValues();
    }

    public BeanDefinition(String id, String className) {
        propertyValues = new MutablePropertyValues();
        this.id = id;
        this.className = className;
    }
}
