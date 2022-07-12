package com.mj;


import com.mj.bean.Skill;
import com.mj.dao.SkillDao;
import com.mj.util.MyBatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class SkillTest {
    private SkillDao dao;

    @Test
    public void get() {
        try (SqlSession session = MyBatises.openSession()) {
            // 生成SkillDao的代理对象
            dao = session.getMapper(SkillDao.class);
            System.out.println(dao.get(8));
        }
    }

    @Test
    public void list() {
        try (SqlSession session = MyBatises.openSession()) {
            // 生成SkillDao的代理对象
            dao = session.getMapper(SkillDao.class);
            System.out.println(dao.list());
        }
    }

    @Test
    public void save() {
        try (SqlSession session = MyBatises.openSession(true)) {
            // 生成SkillDao的代理对象
            dao = session.getMapper(SkillDao.class);
            Assert.assertTrue(dao.save(new Skill("mj888", 100)));
        }
    }

    @Test
    public void update() {
        try (SqlSession session = MyBatises.openSession(true)) {
            // 生成SkillDao的代理对象
            dao = session.getMapper(SkillDao.class);
            Skill skill = new Skill("666", 99);
            skill.setId(26);
            Assert.assertTrue(dao.update(skill));
        }
    }

    @Test
    public void remove() {
        try (SqlSession session = MyBatises.openSession(true)) {
            // 生成SkillDao的代理对象
            dao = session.getMapper(SkillDao.class);
            Assert.assertTrue(dao.remove(25));
        }
    }
}
