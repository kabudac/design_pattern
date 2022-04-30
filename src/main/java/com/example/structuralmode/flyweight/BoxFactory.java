package com.example.structuralmode.flyweight;

import java.util.HashMap;

/**
 * @Author: kabudac
 * @Date: 2022-04-19 16:03:41
 * @Description: 
 */
public class BoxFactory {
    private static HashMap<String,AbstractBox> map;

    private BoxFactory() {
        map = new HashMap<>();
        AbstractBox iBox = new IBox();
        AbstractBox lBox = new LBox();
        AbstractBox oBox = new OBox();

        map.put("I", iBox);
        map.put("O", oBox);
        map.put("L",lBox);
    }

    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    public AbstractBox getBox(String key) {
        return map.get(key);
    }
}
