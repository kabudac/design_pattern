package com.example.structuralmode.composite;

/**
 * @Author: kabudac
 * @Date: 2022-04-19 10:10:37
 * @Description: 
 */
public class MenuItem extends MenuComponent{
    public MenuItem(String name,int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void print(){
        for(int i=1;i<level;i++){
            System.out.println("--");
        }
        System.out.println(name);
    }
}
