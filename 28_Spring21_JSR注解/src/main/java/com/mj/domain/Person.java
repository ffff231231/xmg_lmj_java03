package com.mj.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author 贾登辉
 * @version 1.0
 */
@Component
public class Person {

//    @Resource(name = "dog2")
    @Autowired
    @Qualifier("dog2")
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "dog=" + dog +
                '}';
    }
}
