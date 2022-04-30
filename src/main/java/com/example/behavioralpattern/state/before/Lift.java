package com.example.behavioralpattern.state.before;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 19:40:40
 * @Description:
 */
public class Lift implements ILift {

    private int state;

    @Override
    public void setState(int state) {
        this.state = state;

    }

    @Override
    public void open() {
        switch (this.state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯门打开了.....");
                this.setState(OPENING_STATE);
                break;
            default:
                break;
        }

    }

    @Override
    public void close() {
        switch (this.state) {
            case OPENING_STATE:
                System.out.println("电梯关门了.....");
                this.setState(OPENING_STATE);
                break;
            default:
                // 其他时候们是关着的 不能关门
                break;
        }

    }

    @Override
    public void run() {
        switch (this.state) {
            case CLOSING_STATE:
            case STOPPING_STATE:
                System.out.println("电梯开始运行了.....");
                this.setState(RUNNING_STATE);
                break;

            default:
                break;
        }

    }

    @Override
    public void stop() {
        switch (this.state) {
            case RUNNING_STATE:
            case CLOSING_STATE:
                System.out.println("电梯停止了.....");
                this.setState(STOPPING_STATE);
                break;
            default:
                break;
        }

    }

}
