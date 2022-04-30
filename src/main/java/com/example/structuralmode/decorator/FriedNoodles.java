/**
 * @Author: kabudac
 * @Date: 2022-04-17 19:14:05
 * @Description: 
 */
package com.example.structuralmode.decorator;

/*
 * @Author: kabudac
 * @Date: 2022-04-17 19:14:05
 * @Description: 
 */
public class FriedNoodles extends FastFood{

    public FriedNoodles() {
        super(12,"炒面");
    }

    @Override
    public float cost(){
        return getPrice();
    }
    
}
