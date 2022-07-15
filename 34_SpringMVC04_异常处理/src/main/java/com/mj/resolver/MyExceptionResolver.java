package com.mj.resolver;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class MyExceptionResolver {
    @ExceptionHandler({ArithmeticException.class, ClassCastException.class})
    public ModelAndView resolverException1(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/WEB-INF/page/error/runtime.jsp");
        return mv;
    }

    @ExceptionHandler()
    public ModelAndView resolverException2(Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex", ex);
        mv.setViewName("/WEB-INF/page/error/default.jsp");
        return mv;
    }
}
