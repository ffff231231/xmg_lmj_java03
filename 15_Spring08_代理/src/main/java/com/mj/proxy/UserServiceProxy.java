package com.mj.proxy;

import com.mj.service.UserService;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class UserServiceProxy implements UserService {
    private UserService target;

    public void setTarget(UserService target) {
        this.target = target;
    }
    @Override
    public boolean login(String username, Integer password) {
        System.out.println("日志-----------------1");
        boolean result = target.login(username, password);
        System.out.println("日志-----------------2");
        return result;
    }
}
