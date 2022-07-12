package com.mj.service.impl;

import com.mj.dao.SkillDao;
import com.mj.domain.Skill;
import com.mj.service.SkillService;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class SkillServiceImpl implements SkillService {
    private SkillDao dao;

    public void setDao(SkillDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Skill> list() {
        return dao.list();
    }

    @Override
    public boolean save(Skill skill) {
        return dao.save(skill);
    }

    @Override
    public boolean update(Skill skill) {
        return dao.update(skill);
    }

    public void test() {
        Skill skill = new Skill("777", 777);
        skill.setId(5);
        dao.update(skill);

        //System.out.println(10 / 0);

        dao.save(new Skill("888", 888));
    }
}
