package com.example;

import com.example.framework.context.ApplicationContext;
import com.example.framework.context.support.ClassPathXmlApplicationContext;
import com.example.service.UserService;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 23:12
 * @Description:
 */
public class UserController {
    public static void main(String[] args) throws Exception {
        //创建spring的容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器对象中获取bean对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}
