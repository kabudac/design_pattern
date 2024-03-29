package com.example.behavioralpattern.state.after;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 19:50:46
 * @Description: 
 */
public abstract class LiftState {
    // 定义一个环境角色 也就是封装状态的变化引起的功能变化
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();

}
