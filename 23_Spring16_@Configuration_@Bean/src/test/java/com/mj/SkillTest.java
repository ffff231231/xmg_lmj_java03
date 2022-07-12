package com.mj;

import com.mj.domain.Skill;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class SkillTest {
    private ApplicationContext ctx;

    @Before
    public void before() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() throws Exception {
        System.out.println(ctx.getBean("person"));
    }
}
