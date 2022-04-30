/*
 * @Author: kabubuda
 * @Date: 2022-04-15 16:51:09
 * @Description:
 */
package com.example.creativepattern.factory.factory_method;

import com.example.creativepattern.factory.AmericanCoffee;
import com.example.creativepattern.factory.Coffee;

public class AmericanCoffeeFactory implements CoffeeFactory{

    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

}
