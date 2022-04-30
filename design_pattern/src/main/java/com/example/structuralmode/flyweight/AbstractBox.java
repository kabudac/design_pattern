package com.example.structuralmode.flyweight;
/**
 * @Author: kabudac
 * @Date: 2022-04-19 16:00:29
 * @Description: 
 */
public abstract class AbstractBox {
    public abstract String getShape();

    public void display(String color) {
        System.out.println("方块形状： "+this.getShape()+" 颜色: "+color);
    }
}

