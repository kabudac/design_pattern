package com.example.behavioralpattern.strategy;
/**
 * @Author: kabudac
 * @Date: 2022-04-20 16:13:24
 * @Description: 
 */
public class StrategyA implements Strategy{

    @Override
    public void show() {
        System.out.println("买一送一");
    }
    
}

