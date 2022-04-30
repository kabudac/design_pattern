package com.example.creativepattern.factory.abstract_factory;

import com.example.creativepattern.factory.Coffee;

public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();
}
