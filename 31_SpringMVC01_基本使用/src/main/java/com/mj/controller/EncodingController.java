package com.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 贾登辉
 * @version 1.0
 */

@Controller
@RequestMapping("/encoding")
public class EncodingController {

    @RequestMapping("/login")
    @ResponseBody
    public String login(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        return "login success!";
    }

//    @RequestMapping(value = "/get", produces = "text/plain; charset=UTF-8")
//    @ResponseBody
//    public String get() {
//        return "This is 小码哥";
//    }

    @RequestMapping(value = "/get")
    @ResponseBody
    public String get() {
        return "<h1>This is 小码哥</h1>";
    }
}
