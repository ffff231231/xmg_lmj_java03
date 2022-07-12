package com.mj.service.impl;

import org.springframework.stereotype.Component;

/**
 * @author 贾登辉
 * @version 1.0
 */
@Component("userService")
public class UserServiceImpl {
    private String name = "@Component";

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
