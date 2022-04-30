package com.example.behavioralpattern.mediator;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 09:43:57
 * @Description:
 */
public abstract class Mediator {
    /**
     * 声明一个联络方法
     * @param message 信息
     * @param person 目标
     */
    public abstract void contact(String message,Person person);
}
