package com.example.behavioralpattern.command;

import java.util.ArrayList;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 16:44:31
 * @Description: 命令调用者
 */
public class Waitor {
    
    private ArrayList<Command> commands;

    public Waitor(){
        commands = new ArrayList<Command>();
    }

    public void setCommand(Command command){
        commands.add(command);
    }

    /**
     *  发出命令
     */
    public void orderUp(){
        System.out.println("服务员: 大厨，订单来了......");
        commands.forEach(command ->{
            if(command!=null){
                command.execute();
            }
        });
    }
}

