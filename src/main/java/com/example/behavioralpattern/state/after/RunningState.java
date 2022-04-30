/**
 * @Author: kabudac
 * @Date: 2022-04-20 19:58:24
 * @Description: 
 */
package com.example.behavioralpattern.state.after;

public class RunningState extends LiftState {

    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行.....");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.stop();
    }

}
