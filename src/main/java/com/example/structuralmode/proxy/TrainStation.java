package com.example.structuralmode.proxy;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 10:44:28
 * @Description:
 */
public class TrainStation implements SellTickets{

    @Override
    public void sell() {
        System.out.println("火车站卖票");

    }

}
