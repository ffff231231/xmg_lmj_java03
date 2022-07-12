package com.mj.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author 贾登辉
 * @version 1.0
 */
@Component("user")
@PropertySource("user.properties")
public class User {
    private String name;
    private Dog dog;

    @Value("${name}")
    public void setName(String name) {
        this.name = name;
    }

    @Autowired(required = false)
    @Qualifier("dog")
    public void setDog(Dog dog) {
        this.dog = dog;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "name=" + name +
//                "dog=" + dog +
//                '}';
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
