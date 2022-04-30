package com.example.creativepattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by @Author: kabuda on 2022/4/14 15:42
 */
public class Client {
    public static void main(String[] args) throws Exception {
        reflection();
    }

    static void reflection() throws Exception {
        // 获取Singleton类的字节码对象
        Class<Singleton> clazz = Singleton.class;
        // 获取Singleton类的私有无参构造方法对象
        Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
        // 取消访问检查
        constructor.setAccessible(true);

        // 创建Singleton类的对象s1
        Singleton s1 = constructor.newInstance();
        // 创建Singleton类的对象s2
        Singleton s2 = constructor.newInstance();

        // 判断通过反射创建的两个Singleton对象是否是同一个对象
        System.out.println(s1 == s2);
    }

    static void serialization() throws Exception {
        // 往文件中写对象
        writeObject2File();
        // 从文件中读取对象
        Singleton s1 = readObjectFromFile();
        Singleton s2 = readObjectFromFile();

        // 判断两个反序列化后的对象是否是同一个对象
        System.out.println(s1 == s2);
    }

    private static Singleton readObjectFromFile() throws Exception {
        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("C:\\Users\\pc\\Desktop\\a.txt")));
        // 第一个读取Singleton对象
        Singleton instance = (Singleton) ois.readObject();
        ois.close();

        return instance;
    }

    public static void writeObject2File() throws Exception {
        // 获取Singleton类的对象
        Singleton instance = Singleton.getInstance();
        // 创建对象输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\pc\\Desktop\\a.txt"));
        // 将instance对象写出到文件中
        oos.writeObject(instance);
        oos.close();
    }
}
