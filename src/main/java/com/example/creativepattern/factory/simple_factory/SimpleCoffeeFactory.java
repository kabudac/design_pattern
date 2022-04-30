package com.example.creativepattern.factory.simple_factory;

import com.example.creativepattern.factory.AmericanCoffee;
import com.example.creativepattern.factory.Coffee;
import com.example.creativepattern.factory.LatteCoffee;

public class SimpleCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("americano".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
