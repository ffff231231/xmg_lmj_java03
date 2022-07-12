package com.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 贾登辉
 * @version 1.0
 */

@Controller
public class UserController2 {
    @RequestMapping("/addUser")
    @ResponseBody
    public String add() {
        return "Add Success!";
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public String get() {
        return "Get Success!";
    }

    @RequestMapping("/removeUser")
    @ResponseBody
    public String remove() {
        return "Remove Success!";
    }
}
