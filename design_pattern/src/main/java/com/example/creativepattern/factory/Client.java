
package com.example.creativepattern.factory;

import com.example.creativepattern.factory.factory_method.AmericanCoffeeFactory;
import com.example.creativepattern.factory.factory_method.CoffeeStore;

/**
 * @Author: kabudac
 * @Date: 2022-04-15 16:57:51
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore(new AmericanCoffeeFactory());

        System.out.println(coffeeStore.orderCoffee().getName());
    }

}
