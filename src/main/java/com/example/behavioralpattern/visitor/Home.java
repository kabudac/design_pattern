package com.example.behavioralpattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kabudac
 * @Date: 2022-04-25 20:32:30
 * @Description: 
 */
public class Home {
    private List<Animal> list = new ArrayList<>();

    public void action(Person person){
        list.forEach(node->node.accept(person));
    }

    public void add(Animal animal){
        list.add(animal);
    }
}
