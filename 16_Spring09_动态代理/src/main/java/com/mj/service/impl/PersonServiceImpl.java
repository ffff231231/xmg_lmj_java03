package com.mj.service.impl;

import com.mj.service.PersonService;
import com.mj.service.UserService;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class PersonServiceImpl implements PersonService {


    @Override
    public boolean run(String username, Integer password) {
        System.out.println("PersonServiceImpl - run");
        return false;
    }
}
