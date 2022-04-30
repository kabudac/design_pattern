package com.example.behavioralpattern.state.after;
/**
 * @Author: kabudac
 * @Date: 2022-04-20 19:52:51
 * @Description: 
 */
public class OpenningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启.....");
        
    }

    @Override
    public void close() {
        //状态修改
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().close();
        
    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        
    }
    
}

