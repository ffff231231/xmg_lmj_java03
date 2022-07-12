package com.mj.controller;

import com.mj.domain.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class JspController2 {
    @RequestMapping("/jsp1")
    public String jsp1() {
        return "forward:/page/jsp1.jsp";
    }

    @RequestMapping("/jsp2")
    public ModelAndView jsp2() {
        return new ModelAndView("jsp2");
    }

    @RequestMapping("/jsp3")
    public ModelAndView jsp3() {
        ModelAndView mv = new ModelAndView();

        /*

         */
        mv.setView(new InternalResourceView("/page/jsp3.jsp"));
        return mv;
    }
}