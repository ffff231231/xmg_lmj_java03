package com.mj.dao;

import com.mj.domain.Skill;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
public interface SkillDao {
    List<Skill> list();

    @Insert("INSERT INTO skill(name, level) VALUES(#{name}, #{level})")
    boolean save(Skill skill);

    @Update("UPDATE skill SET name = #{name}, level = #{level} WHERE id = #{id}")
    boolean update(Skill skill);
}
