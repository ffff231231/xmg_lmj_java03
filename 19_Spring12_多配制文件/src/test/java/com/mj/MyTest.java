package com.mj;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test() {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext(
//                "applicationContext.xml",
//                "applicationContext-mybatis.xml",
//                "applicationContext-tx.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "classpath*:applicationContext*.xml");
        System.out.println(ctx.getBean("person"));
        System.out.println(ctx.getBean("dog"));
        System.out.println(ctx.getBean("user"));
    }
}
