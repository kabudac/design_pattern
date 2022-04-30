package com.example.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 14:27
 * @Description:
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {

    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        propertyValueList = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList == null) {
            this.propertyValueList = new ArrayList<>();
        } else {
            this.propertyValueList = propertyValueList;
        }
    }

    private int indexOf(String propertyName) {
        for (int i = 0; i < propertyValueList.size(); i++) {
            if (propertyValueList.get(i).getName().equals(propertyName)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 获取所有的{@link PropertyValue}对象
     *
     * @return {@link PropertyValue[]} 数组
     */
    public PropertyValue[] getPropertyValues() {
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    /**
     * 根据name属性值获取PropertyValue对象
     *
     * @param propertyName 属性名
     * @return {@link PropertyValue}
     */
    public PropertyValue getPropertyValue(String propertyName) {
        int index = indexOf(propertyName);
        if (index == -1) {
            return null;
        }
        return propertyValueList.get(index);
    }

    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    /**
     * 是否包含有指定name属性值的对象
     *
     * @param propertyName 属性名
     * @return {@link Boolean}
     */
    public Boolean contains(String propertyName) {
        return indexOf(propertyName) != -1;
    }

    /**
     * 添加PropertyValue
     *
     * @param propertyValue {@link PropertyValue}
     * @return 返回 {@link MutablePropertyValues}对象 实现链式编程
     */
    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue) {
        //判断集合中存储的对象是否和传递的重复了; 若重复,则覆盖
        int index = indexOf(propertyValue.getName());
        if (index == -1) {
            propertyValueList.add(propertyValue);
        } else {
            //覆盖
            propertyValueList.set(index, propertyValue);
        }
        return this;
    }

    /**
     * 获取迭代器对象
     *
     * @return {@link Iterator}<{@link PropertyValue}>
     */
    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }
}
