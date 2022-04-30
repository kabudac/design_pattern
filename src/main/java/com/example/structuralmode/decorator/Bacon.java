package com.example.structuralmode.decorator;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 19:21:33
 * @Description:
 */
public class Bacon extends Garnish{

    public Bacon(FastFood fastFood){
        super(fastFood, 2, "培根");
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
