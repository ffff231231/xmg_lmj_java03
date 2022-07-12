package com.mj.service.impl;

import com.mj.service.UserService;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class UserServiceImpl implements UserService{

    @Override
    public boolean login(String username, Integer password) {
        System.out.println("UserServiceImpl - login");
        return false;
    }

    @Override
    public boolean register(String username, Integer password) {
        System.out.println("UserServiceImpl - register");
        return false;
    }

}
