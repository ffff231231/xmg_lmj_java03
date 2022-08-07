package com.mj.controller;

import com.mj.domain.Cat;
import com.mj.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableConfigurationProperties({Student.class, Cat.class})
public class TestController {
    @Autowired
    private Cat cat;

    @GetMapping("/test")
    public String test() {
        System.out.println(cat);
        return "test!!!";
    }
}
