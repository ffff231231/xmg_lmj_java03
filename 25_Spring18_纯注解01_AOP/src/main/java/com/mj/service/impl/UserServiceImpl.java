package com.mj.service.impl;

import com.mj.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 贾登辉
 * @version 1.0
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    public void list() {
        System.out.println("UserServiceImpl - list");
    }
}
