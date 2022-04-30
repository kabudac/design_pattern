package com.example.behavioralpattern.iterator.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 13:28:25
 * @Description:
 */
public class MyIterable<T> implements Iterable<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public MyIterator<T> iterator() {
        return new MyIterator<>(list);
    }

}
