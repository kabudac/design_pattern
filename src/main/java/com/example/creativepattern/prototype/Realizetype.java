package com.example.creativepattern.prototype;

/**
 * @Author: kabudac
 * @Date: 2022-04-16 19:20:29
 * @Description:
 */
public class Realizetype implements Cloneable {
    public Realizetype(){
        System.out.println("具体的原型对象创建完成");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {

        System.out.println("具体原型复制成功!");
        return (Realizetype) super.clone();
    }



}

