package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.service.UserService;

/**
 * @Author: kabudac
 * @Date: 2022/4/30 23:07
 * @Description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserServiceImpl.....");
        userDao.add();
    }
}
