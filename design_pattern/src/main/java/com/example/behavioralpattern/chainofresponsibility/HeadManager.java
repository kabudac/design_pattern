package com.example.behavioralpattern.chainofresponsibility;
/**
 * @Author: kabudac
 * @Date: 2022-04-20 17:27:45
 * @Description: 
 */
public class HeadManager extends Handler {
    public HeadManager() {
        //部门经理处理7天以上的请假
        super(Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天," + request.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}

