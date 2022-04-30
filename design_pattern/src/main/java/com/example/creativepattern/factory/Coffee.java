package com.example.creativepattern.factory;

public abstract class Coffee {

    public void addMilk(){
        System.out.println("添加牛奶");
    }

    public void addsugar(){
        System.out.println("添加糖");
    }

    public abstract String getName();

}
