package com.example.structuralmode.decorator;

/*
 * @Author: kabudac
 * @Date: 2022-04-17 16:39:48
 * @Description: 
 */
public class Client {
    public static void main(String[] args) { 
        FastFood food = new Egg(new FriedRice());
        
        System.out.println(food.getDesc()+food.cost());
    }
    
}
