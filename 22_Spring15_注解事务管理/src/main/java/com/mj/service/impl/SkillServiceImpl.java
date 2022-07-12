package com.mj.service.impl;

import com.mj.dao.SkillDao;
import com.mj.domain.Skill;
import com.mj.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
@Service("skillService")
@Transactional
public class SkillServiceImpl implements SkillService {
    private SkillDao dao;

    @Autowired
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

    public void test(Skill skill) throws Exception {
        dao.save(skill);
        throw new RuntimeException();
    }
}
