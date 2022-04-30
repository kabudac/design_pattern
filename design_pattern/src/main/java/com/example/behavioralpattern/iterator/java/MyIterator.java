package com.example.behavioralpattern.iterator.java;

import java.util.Iterator;
import java.util.List;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 13:30:41
 * @Description: 
 */
public class MyIterator<T> implements Iterator<T>{
    private List<T> list;
    private int position = 0;
    
    public MyIterator(List<T> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {

        return position<list.size();
    }

    @Override
    public T next() {
        return list.get(position++);
    }
    
    public void remove(T item) {
        list.remove(item);
    }

    public void add(T item) {
        list.add(item);
    }
    
}
