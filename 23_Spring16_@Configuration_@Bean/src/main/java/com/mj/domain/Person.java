package com.mj.domain;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class Person {
    private Dog dog;

    //@Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "dog=" + dog +
                '}';
    }
}
