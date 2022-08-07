package com.mj.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Data
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test!!!";
    }
}
