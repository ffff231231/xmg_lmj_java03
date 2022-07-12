package com.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class VoidController {

    @RequestMapping("/void")
    public void testVoid(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().write("MJ666");
    }
}
