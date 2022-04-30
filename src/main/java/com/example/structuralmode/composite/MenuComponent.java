package com.example.structuralmode.composite;

/**
 * @Author: kabudac
 * @Date: 2022-04-19 09:26:23
 * @Description: 菜单组件 不管是菜单还是菜单项 都应该继承该类
 */
public class MenuComponent {
    protected String name;
    protected int level;

    /**
     * 添加菜单
     */
    public void add(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    /**
     * 移除菜单
     */
    public void remove(MenuComponent component){
        throw new UnsupportedOperationException();
    }

    /**
     * 获取指定的子菜单
     */
    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException();
    }

    /**
     *  获取菜单名称
     * @return 菜单名称
     */
    public String getName(){
        return name;
    }

    public void print(){
        throw new UnsupportedOperationException();
    }
}
