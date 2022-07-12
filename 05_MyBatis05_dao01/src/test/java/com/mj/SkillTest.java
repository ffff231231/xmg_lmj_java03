package com.mj;


import com.mj.bean.Skill;
import com.mj.dao.SkillDao;
import com.mj.dao.impl.SkillDaoImpl;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class SkillTest {

    @Test
    public void get(){
        SkillDao dao = new SkillDaoImpl();
        System.out.println(dao.get(8));
    }

    @Test
    public void list(){
        SkillDao dao = new SkillDaoImpl();
        System.out.println(dao.list());
    }

    @Test
    public void save(){
        SkillDao dao = new SkillDaoImpl();
        Assert.assertTrue(dao.save(new Skill("mj888", 100)));
    }

    @Test
    public void update(){
        SkillDao dao = new SkillDaoImpl();
        Skill skill = new Skill("666", 99);
        skill.setId(26);
        Assert.assertTrue(dao.update(skill));
    }

    @Test
    public void remove(){
        SkillDao dao = new SkillDaoImpl();
        Assert.assertTrue(dao.remove(26));
    }
}
