package com.example.behavioralpattern.state.before;
/**
 * @Author: kabudac
 * @Date: 2022-04-20 19:36:42
 * @Description: 
 */
public interface ILift {
    // 电梯的四个状态
    public final static int OPENING_STATE = 1;

    public final static int CLOSING_STATE = 2;

    public final static int RUNNING_STATE = 3;

    public final static int STOPPING_STATE = 4;


    // 设置电梯的状态
    public void setState(int state);

    // 电梯的动作
    public void open();

    public void close();

    public void run();

    public void stop();
}

