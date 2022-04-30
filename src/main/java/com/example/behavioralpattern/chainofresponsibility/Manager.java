package com.example.behavioralpattern.chainofresponsibility;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 17:26:48
 * @Description: 
 */
public class Manager extends Handler {

    public Manager() {
        //部门经理处理3-7天的请假
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天," + request.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
    
}
