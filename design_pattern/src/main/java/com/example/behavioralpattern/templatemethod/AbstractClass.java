package com.example.behavioralpattern.templatemethod;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 15:25:03
 * @Description:
 */
public abstract class AbstractClass {
    public final void cookProcess() {
        // 第一步：倒油
        this.pourOil();
        // 第二步：热油
        this.heatOil();
        // 第三步：倒蔬菜
        this.pourVegetable();
        // 第四步：倒调味料
        this.pourSauce();
        // 第五步：翻炒
        this.fry();
    }

    public void pourOil() {
        System.out.println("倒油");
    }

    public void heatOil() {
        System.out.println("热油");
    }

    /**
     * 倒的蔬菜不一样
     */
    public abstract void pourVegetable();

    /**
     * 倒的调料不一样
     */
    public abstract void pourSauce();

    public void fry() {
        System.out.println("翻炒");
    }
}
