package com.example.creativepattern.factory.abstract_factory;

import com.example.creativepattern.factory.Coffee;
import com.example.creativepattern.factory.LatteCoffee;

/**
 * @Description: 意大利风味甜点工厂
 * @Author: kabudac
 * @Date: 2022-04-16 10:42:53
 */
public class ItalyDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }

}
