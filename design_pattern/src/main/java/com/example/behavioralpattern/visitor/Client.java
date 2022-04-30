package com.example.behavioralpattern.visitor;

/**
 * @Author: kabudac
 * @Date: 2022-04-25 20:34:57
 * @Description: 
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());

        Owner owner = new Owner();
        home.action(owner);
    }
}
