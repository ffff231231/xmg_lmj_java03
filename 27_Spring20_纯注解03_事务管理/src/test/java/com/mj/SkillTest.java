package com.mj;

import com.mj.dao.SkillDao;
import com.mj.domain.Skill;
import com.mj.service.SkillService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class SkillTest {
    private ApplicationContext ctx;
    private SkillService skillService;

    @Before
    public void before() {
        ctx = new AnnotationConfigApplicationContext("com.mj");
        skillService = ctx.getBean("skillService", SkillService.class);
    }

    @Test
    public void save() throws Exception {
        skillService.test(null);
    }
}
