package com.mj.service.impl;

import com.mj.service.UserService;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class UserServiceImpl implements UserService{

    @Override
    public boolean login(String username, Integer password) {
        System.out.println("09 - UserServiceImpl - login - " + username + "_" + password);
        return false;
    }

}
