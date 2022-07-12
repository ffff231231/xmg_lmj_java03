package com.mj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class ConnTest {
    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ctx.getBean("conn"));
    }

    @Test
    public void spEl() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ctx.getBean("person"));
    }
}
