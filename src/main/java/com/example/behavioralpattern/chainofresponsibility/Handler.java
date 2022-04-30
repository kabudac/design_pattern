package com.example.behavioralpattern.chainofresponsibility;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 17:15:39
 * @Description: 处理者抽象类
 */
public abstract class Handler {
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // 该领导的处理请假天数区间
    private int numStart;
    private int numEnd;

    // 领导上面还有领导
    private Handler nextHandler;

    /**
     * 设置请假天数范围 上不封顶
     * 
     * @param numStart 起始请假天数
     */
    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    /**
     * 设计上级领导
     * 
     * @param nextHandler 上级领导
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract void handleLeave(LeaveRequest request);

    public final void submit(LeaveRequest request) {
        if (0 == this.numStart) {
            return;
        }

        // 如果请假天数达到该领导的处理要求
        if (request.getNum() >= this.numStart) {
            this.handleLeave(request);

            // 如果还有上级 并且请假天数超过了当前领导的处理范围
            if (null != this.nextHandler && request.getNum() > numEnd) {
                this.nextHandler.submit(request);
            }else{
                System.out.println("流程结束");
            }
        }
    }

}
