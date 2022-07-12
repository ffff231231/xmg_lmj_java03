package com.mj.dao;

import com.mj.bean.Skill;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
public interface SkillDao {
    boolean save(Skill skill);
    boolean update(Skill skill);
    boolean remove(Integer id);
    Skill get(Integer id);
    List<Skill> list();
}
