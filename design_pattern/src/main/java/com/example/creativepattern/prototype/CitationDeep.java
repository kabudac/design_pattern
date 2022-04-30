package com.example.creativepattern.prototype;

/**
 * @Author: kabudac
 * @Date: 2022-04-16 19:39:14
 * @Description:
 */
public class CitationDeep implements Cloneable{

    private Student student;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student){
        this.student = student;
    }

    void show(){
        System.out.println(student.getName()+"同学在2022年获得奖状");
    }


    @Override
    protected CitationDeep clone() throws CloneNotSupportedException {

        return (CitationDeep) super.clone();
    }

}

