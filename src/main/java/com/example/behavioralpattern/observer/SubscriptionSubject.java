package com.example.behavioralpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kabudac
 * @Date: 2022-04-21 16:47:51
 * @Description: 
 */
public class SubscriptionSubject implements Subject{

    // 储存订阅公众号的微信用户
    private List<Observer> userList = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        userList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        userList.remove(observer);
    }

    @Override
    public void notify(String message) {
        userList.forEach(user->user.update(message));
    }
    
}
