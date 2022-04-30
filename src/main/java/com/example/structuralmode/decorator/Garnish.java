package com.example.structuralmode.decorator;
/**
 * @Author: kabudac
 * @Date: 2022-04-17 19:16:20
 * @Description: 配料表
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public Garnish(FastFood fastFood,float price,String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

}

