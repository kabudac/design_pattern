package com.example.behavioralpattern.mediator;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 09:52:24
 * @Description: 具体同事类 承租人
 */
public class Tenant extends Person {

    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contack(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息" + message);
    }

}
