package com.mj.service.impl;

import com.mj.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class UserServiceImpl implements UserService, BeanNameAware, ApplicationContextAware {
    private ApplicationContext ctx;
    private String beanName;

    @Override
    public void setBeanName(String s) {
        beanName = s;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ctx = applicationContext;
    }

    @Override
    public boolean login(String username, Integer password) {
        System.out.println("UserServiceImpl - login");
        //ctx.getBean(beanName, UserService.class).register(username, password);
        return false;
    }

    @Override
    public boolean register(String username, Integer password) {
        System.out.println("UserServiceImpl - register");
        return false;
    }
}
