package com.example.behavioralpattern.mediator;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 09:45:04
 * @Description: 抽象同事类 
 */
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
