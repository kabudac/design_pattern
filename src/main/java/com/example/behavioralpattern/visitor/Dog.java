package com.example.behavioralpattern.visitor;

/**
 * @Author: kabudac
 * @Date: 2022-04-25 20:27:06
 * @Description:
 */
public class Dog implements Animal{

    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃，汪汪汪");
    }

}
