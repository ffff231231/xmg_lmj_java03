package com.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class TestController {
    @RequestMapping("/test1")
    @ResponseBody
    public String test1() {
        System.out.println("test1------------------");
        return "test1 success!";
    }
}
