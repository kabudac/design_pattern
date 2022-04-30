package com.example.behavioralpattern.iterator;

import com.example.behavioralpattern.iterator.java.MyIterable;
import com.example.behavioralpattern.iterator.java.MyIterator;

/**
 * @Author: kabudac
 * @Date: 2022-04-22 13:39:18
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        MyIterable<Student> iterable = new MyIterable<>();
        MyIterator<Student> iterator = iterable.iterator();
        iterator.add(new Student("张三", "123"));
        iterator.add(new Student("李四", "123"));

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
