package com.example.behavioralpattern.strategy;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 16:14:02
 * @Description: 
 */
public class StrategyB implements Strategy {

    @Override
    public void show() {
        System.out.println("满200减50");
    }
    
}
