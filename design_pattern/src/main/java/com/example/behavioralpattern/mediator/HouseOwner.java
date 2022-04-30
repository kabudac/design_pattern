package com.example.behavioralpattern.mediator;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 09:49:21
 * @Description: 具体同事类
 */
public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 与中介者联系
     * 
     * @param message 信息
     */
    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息" + message);
    }

}
