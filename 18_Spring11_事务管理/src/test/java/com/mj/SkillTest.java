package com.mj;

import com.mj.domain.Skill;
import com.mj.service.SkillService;
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
    private SkillService skillService;

    @Before
    public void before() {
        ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        skillService = ctx.getBean("skillService", SkillService.class);
    }

    @Test
    public void list() {
        List<Skill> skills = skillService.list();
        System.out.println(skills);
    }

    @Test
    public void save() {
        System.out.println(skillService.save(new Skill("123", 456)));
    }

    @Test
    public void test() {
        skillService.test();
    }
}
