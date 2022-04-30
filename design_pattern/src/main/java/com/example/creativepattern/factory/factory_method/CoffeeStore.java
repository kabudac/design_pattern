package com.example.creativepattern.factory.factory_method;

import com.example.creativepattern.factory.Coffee;

public class CoffeeStore {
    private CoffeeFactory factory;

    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addsugar();
        return coffee;
    }
}
