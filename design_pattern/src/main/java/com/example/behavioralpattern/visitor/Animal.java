package com.example.behavioralpattern.visitor;

/**
 * @Author: kabudac
 * @Date: 2022-04-25 20:27:42
 * @Description:
 */
public interface Animal {
    void accept(Person person);
}
