package com.example.behavioralpattern.memento.whitebox;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @Author: kabudac
 * @Date: 2022-04-26 10:19:46
 * @Description: 游戏状态存储类（备忘录类）
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleStateMemento {
    private int vit;
    private int atk;
    private int def;
}
