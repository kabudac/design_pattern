package com.example.behavioralpattern.memento.whitebox;

/**
 * @Author: kabudac
 * @Date: 2022-04-26 10:21:49
 * @Description: 角色状态管理者类
 */
public class RoleStateCaretaker {
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
