package com.example.structuralmode.decorator;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 16:41:06
 * @Description:
 */
public class FriedRice extends FastFood{

    @Override
    public float cost() {
        return getPrice();
    }

    public FriedRice(){
        super(10,"炒饭");
    }

}
