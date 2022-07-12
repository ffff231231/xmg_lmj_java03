package com.mj;

import com.mj.cfg.BeanConfig;
import com.mj.domain.Dog;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class SkillTest {
    private ApplicationContext ctx;

    @Before
    public void before() {
//        ctx = new AnnotationConfigApplicationContext("com.mj");
        ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

    }

    @Test
    public void test() throws Exception {
//        System.out.println(ctx.getBean("dog"));
//        System.out.println(ctx.getBean("person"));
//        System.out.println(ctx.getBean("beanConfig"));
        System.out.println(ctx.getBean("userService"));
//        System.out.println(ctx.getBean("com.mj.domain.Person"));
//        System.out.println(ctx.getBean("com.mj.cfg.BeanConfig"));
    }
}
