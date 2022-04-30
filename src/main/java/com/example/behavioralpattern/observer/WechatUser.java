package com.example.behavioralpattern.observer;

/**
 * @Author: kabudac
 * @Date: 2022-04-21 16:44:27
 * @Description:
 */
public class WechatUser implements Observer {

    // 用户名
    private String name;

    public WechatUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }

}
