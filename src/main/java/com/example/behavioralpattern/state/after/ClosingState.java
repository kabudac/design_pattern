
package com.example.behavioralpattern.state.after;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 19:58:20
 * @Description:
 */
public class ClosingState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭.....");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.stop();
    }

}
