package com.example.structuralmode.decorator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: kabudac
 * @Date: 2022-04-17 16:36:32
 * @Description: 快餐接口
 */
@Setter
@Getter
@AllArgsConstructor
public abstract class FastFood {
    private float price;

    private String desc;

    public abstract float cost();

}
