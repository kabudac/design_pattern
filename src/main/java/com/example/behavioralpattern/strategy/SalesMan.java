package com.example.behavioralpattern.strategy;
/**
 * @Author: kabudac
 * @Date: 2022-04-20 16:15:01
 * @Description: 把促销活动推销给客户，这里可以理解为销售员
 */

public class SalesMan {
    //持有抽象策略角色的引用
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 向客户展示促销活动
     */
    public void salesManShow(){
        strategy.show();
    }
}
