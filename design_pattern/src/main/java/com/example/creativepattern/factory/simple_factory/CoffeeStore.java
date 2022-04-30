package com.example.creativepattern.factory.simple_factory;

import com.example.creativepattern.factory.Coffee;

public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
