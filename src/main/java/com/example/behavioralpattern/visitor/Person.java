package com.example.behavioralpattern.visitor;

/**
 * @Author: kabudac
 * @Date: 2022-04-25 20:25:08
 * @Description: 
 */
public interface Person {
    void feed(Cat cat);

    void feed(Dog dog);
}
