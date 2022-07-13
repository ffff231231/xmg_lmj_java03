package com.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
 
import java.util.Map;

@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public String test(@RequestParam Map<String, Object> map) {
        System.out.println(map);
        return "success!";
    }
}
