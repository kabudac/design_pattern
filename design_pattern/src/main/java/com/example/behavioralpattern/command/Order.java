package com.example.behavioralpattern.command;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 16:36:11
 * @Description: 
 */
@Getter
@Setter
public class Order {
    // 餐桌号码
    private int diningTable;

    // 用来存储餐名并记录份数
    private Map<String,Integer> foodDic = new HashMap<>();

    public void setFoodDic(String name,int num) {
        foodDic.put(name,num);
    }
}
