package com.example.structuralmode.decorator;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 19:19:34
 * @Description:
 */
public class Egg extends Garnish{
    public Egg(FastFood fastFood){
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        return getPrice()+getFastFood().getPrice();
    }

    @Override
    public String getDesc(){
        return super.getDesc()+getFastFood().getDesc();
    }

}
