package com.example.behavioralpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 13:20:56
 * @Description: 
 */
public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        this.list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.list.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
    
}
