package com.example.behavioralpattern.memento.blackbox;

/**
 * @Author: kabudac
 * @Date: 2022-04-26 16:12:02
 * @Description: 
 */
public class RoleStateCaretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
