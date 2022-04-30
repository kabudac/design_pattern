package com.example.behavioralpattern.templatemethod;

/**
 * @Author: kabudac
 * @Date: 2022-04-20 15:28:50
 * @Description: 
 */
public class ContreteClassBaoCai extends AbstractClass {

    @Override
    public void pourVegetable() {
        System.out.println("下锅的是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的是辣椒");
    }
    
}
