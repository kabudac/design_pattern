package com.example.structuralmode.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kabudac
 * @Date: 2022-04-19 09:36:43
 * @Description:
 */
public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponentList;

    public Menu(String name, int level) {
        this.level = level;
        this.name = name;
        menuComponentList = new ArrayList<>();
    }

    @Override
    public void add(MenuComponent component) {
        menuComponentList.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponentList.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.println("--");
        }
        System.out.println(name);

        menuComponentList.forEach(MenuComponent::print);
    }
}

