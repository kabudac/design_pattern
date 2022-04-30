package com.example.structuralmode.proxy;

import com.example.structuralmode.proxy.cglibproxy.ProxyFactory;
import com.example.structuralmode.proxy.cglibproxy.TrainStation;

/*
 * @Author: kabudac
 * @Date: 2022-04-17 10:48:05
 * @Description: 
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxy = new ProxyFactory();
        TrainStation station = proxy.getProxyObject();
        station.sell();
    }    
}
