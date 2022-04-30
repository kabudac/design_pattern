package com.example.creativepattern.singleton;

/**
 * Created by @Author: kabuda on 2022/4/14 15:47
 */
public enum SingletonEnum {
    /**
     * 实例
     */
    INSTANCE;

    SingletonEnum getInstance() {
        return INSTANCE;
    }

    void run() {
        System.out.println("测试方法");
    }
}
