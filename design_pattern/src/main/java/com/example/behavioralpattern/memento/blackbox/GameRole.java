package com.example.behavioralpattern.memento.blackbox;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author: kabudac
 * @Date: 2022-04-26 11:05:39
 * @Description:
 */
@Getter
@Setter
public class GameRole {
    private int vit;
    private int atk;
    private int def;

    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public void stateDisplay() {
        System.out.println("角色生命力：" + vit);
        System.out.println("角色攻击力：" + atk);
        System.out.println("角色防御力：" + def);

    }

    public Memento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    private class RoleStateMemento implements Memento {
        private int vit;
        private int atk;
        private int def;
    }
}
