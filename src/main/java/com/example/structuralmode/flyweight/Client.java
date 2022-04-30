package com.example.structuralmode.flyweight;

/**
 * @Author: kabudac
 * @Date: 2022-04-19 16:07:47
 * @Description: 
 */
public class Client {
    public static void main(String[] args) {
        BoxFactory boxFactory = BoxFactory.getInstance();
        
        //得到的对象是一样的
        System.out.println(boxFactory.getBox("I"));
        System.out.println(boxFactory.getBox("I"));
    }
}
