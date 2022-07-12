package com.mj.servlet;

import com.mj.factory.GeneralFactory;
import com.mj.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 贾登辉
 * @version 1.0
 */

// 耦合：我依赖你，你不见了（或者不要你了），对我影响很大，我就得改代码

// 写代码的方向：解耦、降低耦合性

// 工厂设计模式

public class PersonServlet {
    // private PersonService service = GeneralFactory.get("personService");
    private PersonService service;

    public void setService(PersonService service) {
        this.service = service;
    }

    public void remove() {
        service.remove(1);
    }

    public static void main(String[] args) {
        // 读取配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonServlet servlet = ctx.getBean("personServlet", PersonServlet.class);
        servlet.remove();
    }

    /*
    IoC:Inversion of Control,控制反转。对象创建的控制权转交给了Spring
    * */
}
