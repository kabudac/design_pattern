package com.example.structuralmode.proxy.staticproxy;

import com.example.structuralmode.proxy.SellTickets;
import com.example.structuralmode.proxy.TrainStation;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 10:46:23
 * @Description: 代售点
 */
public class ProxyPoint implements SellTickets{

    private TrainStation station = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费用");
        station.sell();
    }

}
