package com.example.creativepattern.builder;

/**
 * @Author: kabudac
 * @Date: 2022-04-16 20:19:48
 * @Description:
 */
public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {

        return bike;
    }

}

