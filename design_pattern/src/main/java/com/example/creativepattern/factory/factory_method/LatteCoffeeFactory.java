package com.example.creativepattern.factory.factory_method;

import com.example.creativepattern.factory.Coffee;
import com.example.creativepattern.factory.LatteCoffee;

public class LatteCoffeeFactory implements CoffeeFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

}
