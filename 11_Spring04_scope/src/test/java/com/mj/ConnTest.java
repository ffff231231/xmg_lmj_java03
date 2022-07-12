package com.mj;

import com.mj.domain.Dog;
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
        Dog dog1 = ctx.getBean("dog", Dog.class);
        Dog dog2 = ctx.getBean("dog", Dog.class);
        System.out.println(dog1 + "_" + dog2);
        System.out.println(dog1 == dog2);
    }

}
