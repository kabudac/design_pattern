package com.example.behavioralpattern.memento.blackbox;
/**
 * @Author: kabudac
 * @Date: 2022-04-26 16:14:14
 * @Description: 
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-------大战Boss前-------");

        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("------------大战Boss后------------");
        //大战Boss时，损耗严重
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("------------恢复之前状态------------");
        //恢复之前状态
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}

