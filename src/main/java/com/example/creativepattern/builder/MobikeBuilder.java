package com.example.creativepattern.builder;

/**
 * @Author: kabudac
 * @Date: 2022-04-16 20:18:33
 * @Description:
 */
public class MobikeBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }

}
