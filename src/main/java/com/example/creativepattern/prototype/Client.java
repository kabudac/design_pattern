/**
 * @Author: kabudac
 * @Date: 2022-04-16 19:27:09
 * @Description:
 */
package com.example.creativepattern.prototype;

/**
 * @Author: kabudac
 * @Date: 2022-04-16 19:27:09
 * @Description:
 */
public class Client {
    public static void main(String[] args) throws Exception {
        CitationDeep  c1 = new CitationDeep();
        Student stu = new Student("张三","西安");
        c1.setStudent(stu);

        CitationDeep c2 = c1.clone();

        Student stu2 = new Student("李四","四川");
        c2.setStudent(stu2);
        c1.show();
        c2.show();
    }

}

