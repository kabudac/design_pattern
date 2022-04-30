package com.example.creativepattern.factory.simple_factory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.example.creativepattern.factory.Coffee;

/**
 * @Author: kabudac
 * @Date: 2022-04-16 14:47:20
 * @Description: 改进工厂类
 */
public class CoffeeFactory {
    private static Map<String,Coffee> map = new HashMap<>();

    static{
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try{
            p.load(is);
            //遍历Properties集合对象
            for(Object key:p.keySet()){
                 String className = p.getProperty(key.toString());
                Coffee coffee = (Coffee)Class.forName(className).newInstance();
                map.put(key.toString(), coffee);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }


    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}

