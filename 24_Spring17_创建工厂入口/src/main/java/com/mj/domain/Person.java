package com.mj.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**
 * @author 贾登辉
 * @version 1.0
 */
@Component
public class Person {
    @Autowired
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "dog=" + dog +
                '}';
    }
}
