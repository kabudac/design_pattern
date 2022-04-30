package com.example.behavioralpattern.command;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 16:50:02
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        // 创建两个Order
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.getFoodDic().put("西红柿鸡蛋面", 1);
        order1.getFoodDic().put("小杯可乐", 2);

        Order order2 = new Order();
        order2.setDiningTable(3);
        order2.getFoodDic().put("尖椒肉丝盖饭", 1);
        order2.getFoodDic().put("小杯雪碧", 1);

        // 创建接收者
        SeniorChef receiver = new SeniorChef();
        // 将订单和接收者封装成命令对象
        OrderCommand cmd1 = new OrderCommand(receiver, order1);
        OrderCommand cmd2 = new OrderCommand(receiver, order2);

        // 创建调用者 waitor
        Waitor invoker = new Waitor();
        invoker.setCommand(cmd1);
        invoker.setCommand(cmd2);
        invoker.orderUp();
    }

}
