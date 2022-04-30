package com.example.behavioralpattern.visitor;

/**
 * @Author: kabudac
 * @Date: 2022-04-25 20:29:33
 * @Description: 
 */
public class Someone implements Person{

    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂食狗");
    }
    
}
