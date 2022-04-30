package com.example.creativepattern.prototype;

/**
 * @Author: kabudac
 * @Date: 2022-04-16 19:25:05
 * @Description: 奖状类
 */
public class Citation implements Cloneable {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name+"同学在2022获得奖状");
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

}

