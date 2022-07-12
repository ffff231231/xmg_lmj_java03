package com.mj;

import com.mj.dao.SkillDao;
import com.mj.domain.Skill;
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
    private SkillDao dao;

    @Before
    public void before() {
        ctx = new AnnotationConfigApplicationContext("com.mj");
        dao = ctx.getBean("skillDao", SkillDao.class);
    }

    @Test
    public void list() {
        List<Skill> skills = dao.list();
        System.out.println(skills);
    }

    @Test
    public void save() {

        System.out.println(dao.save(new Skill("123", 456)));
    }
}
