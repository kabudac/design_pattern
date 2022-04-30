package com.example.creativepattern.factory.abstract_factory;

import com.example.creativepattern.factory.AmericanCoffee;
import com.example.creativepattern.factory.Coffee;

/*
 * @Description:
 * @Author: kabubuda
 * @Date: 2022-04-16 10:28:31
 */
public class AmericanDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {

        return new MatchaMousse();
    }

}
