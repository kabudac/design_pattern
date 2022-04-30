package com.example.behavioralpattern.command;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 16:35:21
 * @Description: 
 */
public class OrderCommand implements Command{

    // 命令的接收者
    private SeniorChef receiver;
    private Order order;

    public OrderCommand(SeniorChef receiver,Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"桌订的餐：");
        order.getFoodDic().keySet().forEach(key->{
            receiver.makeFood(order.getFoodDic().get(key), key);
        });

        try {
            //停顿一下
            Thread.sleep(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(order.getDiningTable()+"桌的饭弄好了");
    }
    
}
