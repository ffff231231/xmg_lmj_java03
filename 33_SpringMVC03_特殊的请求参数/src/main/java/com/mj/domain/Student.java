package com.mj.domain;

import java.util.List;

public class Student {
    private String name;
    private Integer age;
    private List<String> nickName;
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getNickName() {
        return nickName;
    }

    public void setNickName(List<String> nickName) {
        this.nickName = nickName;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
