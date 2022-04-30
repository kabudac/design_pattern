package com.example.behavioralpattern.iterator;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 10:39:58
 * @Description: 抽象容器类
 */
public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
