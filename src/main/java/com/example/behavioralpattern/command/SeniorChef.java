package com.example.behavioralpattern.command;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 16:39:24
 * @Description: 命令的接收者 
 */
public class SeniorChef {
    public void makeFood(int num,String foodName){
        System.out.println(num+"份"+foodName);
    }
}
