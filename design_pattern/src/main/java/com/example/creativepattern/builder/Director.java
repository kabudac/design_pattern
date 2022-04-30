package com.example.creativepattern.builder;
/**
 * @Author: kabudac
 * @Date: 2022-04-16 20:22:00
 * @Description: 指挥者类
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}

