package com.example.behavioralpattern.iterator;

import java.util.List;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 10:35:08
 * @Description: 
 */
public class StudentIteratorImpl implements StudentIterator{

    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position<list.size();
    }

    @Override
    public Student next() {
        return list.get(position++);
    }
    
}
