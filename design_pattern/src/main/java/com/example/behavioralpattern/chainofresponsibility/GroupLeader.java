package com.example.behavioralpattern.chainofresponsibility;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 17:25:02
 * @Description: 小组长
 */
public class GroupLeader extends Handler{

    public GroupLeader() {
        //小组长处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest request) {
        System.out.println(request.getName() + "请假" + request.getNum() + "天," + request.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }
    
    
}
