package com.example.creativepattern.builder;

/**
 * @Author: kabudac
 * @Date: 2022-04-16 20:16:56
 * @Description: 抽象builder类
 */
public abstract class Builder {
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
