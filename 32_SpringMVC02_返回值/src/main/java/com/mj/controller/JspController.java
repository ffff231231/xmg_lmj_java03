package com.mj.controller;

import com.mj.domain.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class JspController {
    @RequestMapping("/test/dog/jsp1")
    public ModelAndView jsp1() {
        ModelAndView mv = new ModelAndView();

        // 设置数据
        Dog dog = new Dog();
        dog.setName("Larry");
        dog.setPrice(200);

        // 本质就是request.setAttribute
        mv.addObject("dog", dog);

        // 设置需要转发的页面
        mv.setViewName("/page/jsp1.jsp");

        return mv;
    }

    @RequestMapping("/jsp2")
    public String jsp2(HttpServletRequest request) {
        // 设置数据
        Dog dog = new Dog();
        dog.setName("Larry");
        dog.setPrice(200);

        // 本质就是request.setAttribute
        request.setAttribute("dog", dog);
        return "/page/jsp2.jsp";
    }

    @RequestMapping("/jsp3")
    public String jsp3() {
        return "redirect:/page/jsp3.jsp";
    }

    @RequestMapping("/jsp4")
    public ModelAndView jsp4() {
        ModelAndView mv = new ModelAndView();

        mv.addObject("name", "Jack");
        mv.addObject("price", 666);

        // 设置需要重定向的页面
        mv.setViewName("redirect:/page/jsp4.jsp?test=10");
        return mv;
    }

//    @RequestMapping("/jsp5")
//    public String jsp5() {
//        return "/WEB-INF/page/jsp5.jsp";
//    }
}

/*
在 Java 代码中，路径问题总结：
1.假设请求路径是："http://IP地址:端口/context_path/path1/path2/path3"
2.假设转发路径是："/page/test.jsp"
    1> 以斜线（/）开头，参考路径是context_path
    2> 所以最终转发路径是："http://IP地址:端口/context_path" + "/page/test.jsp"
3.假设转发路径是："page/test.jsp"
    1> 不以斜线（/）开头，参考路径是当前请求路径的上一层路径
    2> 所以最终转发路径是："http://IP地址:端口/context_path/path1/path2/" + "page/test.jsp"


在 jsp、html 代码中，路径问题总结：
1.假设请求路径是："http://IP地址:端口/context_path/path1/path2/path3"
2.假设跳转路径是："/page/test.jsp"
    1> 以斜线（/）开头，参考路径是"http://IP地址:端口"
    2> 所以最终转发路径是："http://IP地址:端口" + "/page/test.jsp"
3.假设转发路径是："page/test.jsp" （这里和Java代码中一样）
    1> 不以斜线（/）开头，参考路径是当前请求路径的上一层路径
    2> 所以最终转发路径是："http://IP地址:端口/context_path/path1/path2/" + "page/test.jsp"
*/
