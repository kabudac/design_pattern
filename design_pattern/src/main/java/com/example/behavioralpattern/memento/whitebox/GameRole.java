package com.example.behavioralpattern.memento.whitebox;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: kabudac
 * @Date: 2022-04-25 20:56:12
 * @Description:
 */
@Getter
@Setter
public class GameRole {
    private int vit;

    private int atk;

    private int def;

    /**
     * 初始化状态
     */
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

    public void stateDisplay(){
        System.out.println("角色生命力"+vit);
        System.out.println("角色攻击力"+atk);
        System.out.println("角色防御力"+def);
    }

    public void recoverState(RoleStateMemento roleStateMemento){
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();
        this.vit = roleStateMemento.getVit();
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }
}
