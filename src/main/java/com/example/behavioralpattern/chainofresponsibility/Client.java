package com.example.behavioralpattern.chainofresponsibility;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 17:28:31
 * @Description:
 */

public class Client {
    public static void main(String[] args) {
        LeaveRequest request = new LeaveRequest("小李", 5, "生病");

        // 各位领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        HeadManager headManager = new HeadManager();
        // 小组长的领导是部门经理
        groupLeader.setNextHandler(manager);
        // 部门经理的领导是总经理
        manager.setNextHandler(headManager);
        // 之所以在这里设置上级领导，是因为可以根据实际需求来更改设置，如果实战中上级领导人都是固定的，则可以移到领导实现类中。

        // 提交申请
        groupLeader.submit(request);
    }
}
