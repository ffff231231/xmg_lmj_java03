package com.mj.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("person")
@Data
public class Person {
    private Integer id;
    private Integer age;
    private String name;
    private String[] nickNames;
    private Dog dog;
    private List<Dog> dogs;

    @Data
    public static class Dog {
        private Integer age;
        private String name;
    }
}
