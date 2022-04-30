package com.example.structuralmode.facade;

/**
 * @Author: kabudac
 * @Date: 2022-04-18 14:37:14
 * @Description:
 */
public class SmartFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String message){
        if(message.contains("打开")){
            on();
        }else if(message.contains("关闭")){
            off();
        }else{
            System.out.println("听不懂");
        }
    }

    public void on(){
        System.out.println("起床了");
        light.on();
        tv.on();
        airCondition.on();
    }

    public void off(){
        System.out.println("睡觉了");
        light.off();
        tv.off();
        airCondition.off();
    }
}
