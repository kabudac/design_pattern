package com.example.behavioralpattern.observer;

/**
 * @Author: kabudac
 * @Date: 2022-04-21 16:45:43
 * @Description: 
 */
public interface Subject {
    /**
     *  增加订阅者
     * @param observer 订阅者
     */
    public void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer 订阅者
     */
    public void detach(Observer observer);

    /**
     * 通知订阅者更新消息
     * @param message 消息
     */
    public void notify(String message);
}
