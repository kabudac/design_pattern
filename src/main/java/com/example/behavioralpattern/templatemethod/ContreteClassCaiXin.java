package com.example.behavioralpattern.templatemethod;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 15:30:06
 * @Description: 
 */
public class ContreteClassCaiXin extends AbstractClass{

    @Override
    public void pourVegetable() {
        System.out.println("下锅的是菜心");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的是蒜蓉");
    }
    
}
