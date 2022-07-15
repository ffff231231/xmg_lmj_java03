package com.mj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class ExceptionController {
    @RequestMapping("/test1")
    public void test1() {
        throw new ArithmeticException("test1");
    }

    @RequestMapping("/test2")
    public void test2() throws Exception {
        throw new ClassNotFoundException("test2");
    }

    @RequestMapping("/test3")
    public void test3() throws Exception {
        throw new IOException("test3");
    }

    @RequestMapping("/test4")
    public void test4() {
        throw new ClassCastException("test4");
    }

//    @ExceptionHandler({ArithmeticException.class, ClassCastException.class})
//    public ModelAndView resolverException1(Exception ex) {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("ex", ex);
//        mv.setViewName("/WEB-INF/page/error/runtime.jsp");
//        return mv;
//    }
//
//    @ExceptionHandler()
//    public ModelAndView resolverException2(Exception ex) {
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("ex", ex);
//        mv.setViewName("/WEB-INF/page/error/default.jsp");
//        return mv;
//    }
}
