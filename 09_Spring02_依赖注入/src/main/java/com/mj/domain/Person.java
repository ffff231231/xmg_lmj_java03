package com.mj.domain;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class Person {
    private Integer age;
    private String name;
    private BigDecimal money;
    private Dog dog;
    private String[] nickNames;

    public Person() {
        System.out.println("Person()");
    }

    public Person(int age) {
        this.age = age;
        System.out.println("Person(" + age + ")");
    }

    @ConstructorProperties({"age", "name"})
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("Person(" +  age + "," + name + ")");
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void setNickNames(String[] nickNames) {
        this.nickNames = nickNames;
    }

    public String[] getNickNames() {
        return nickNames;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", dog=" + dog +
                ", nickName=" + Arrays.toString(nickNames) +
                '}';
    }
}
