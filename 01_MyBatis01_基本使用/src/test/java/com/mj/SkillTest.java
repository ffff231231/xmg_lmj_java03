package com.mj;

import com.github.pagehelper.PageHelper;
import com.mj.bean.Skill;
import com.mj.util.MyBatises;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SkillTest {
    @Test
    public void select() throws Exception {
        try (Reader reader  = Resources.getResourceAsReader("mybatis-config.xml")) {
            // 创建一个工厂构建器
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

            // 创建一个工厂
            SqlSessionFactory factory = builder.build(reader);

            // 创建一个Session
            try (SqlSession session = factory.openSession()) {
                // 执行SQL语句
                List<Skill> skills = session.selectList("skill.list");
                for (Skill skill : skills) {
                    System.out.println(skill);
                }

            }
        }
    }

    @Test
    public void select2() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {
            Skill skill = session.selectOne("skill.get", 1);
            System.out.println(skill);
        }
    }

    @Test
    public void select3() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {
//            Map<String, Object> map = new HashMap<>();
//            map.put("id", 4);
//            map.put("level", 50);
//            List<Skill> skills = session.selectList("skill.list2", map);

            Skill param = new Skill();
            param.setId(4);
            param.setLevel(50);
            param.setName("M");
            List<Skill> skills = session.selectList("skill.list2", param);

            for (Skill skill : skills) {
                System.out.println(skill);
            }
        }
    }

    @Test
    public void select4() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {
            List<Skill> skills = session.selectList("skill.list3", "%m%");

            for (Skill skill : skills) {
                System.out.println(skill);
            }
        }
    }

    @Test
    public void insert() throws Exception {
        try (SqlSession session = MyBatises.openSession(true)) {
            Skill skill = new Skill("iOS", 888);
            session.insert("skill.insert", skill);
        }
    }

    @Test
    public void insert2() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {
            Skill skill = new Skill("Android", 999);
            session.insert("skill.insert2", skill);
            System.out.println(skill.getId());

            session.commit();
        }
    }

    @Test
    public void insert3() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {
            Skill skill = new Skill("Android", 999);
            session.insert("skill.insert3", skill);
            System.out.println(skill.getId());

            session.commit();
        }
    }

    @Test
    public void update() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {
            Skill skill = new Skill("Java", 666);
            skill.setId(21);

            session.update("skill.update", skill);

            session.commit();
        }
    }

    @Test
    public void delete() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {

            session.delete("skill.delete", 22);

            session.commit();
        }
    }

    @Test
    public void dynamicSQL() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {
            Map<String, Object> param = new HashMap<>();
            param.put("id", 5);
//            param.put("name", "%s%");
            param.put("level", 800);
            /*
            SELECT * FROM skill WHERE 1 = 1
            AND id > #{id}
            AND name LIKE #{name}
            AND level < #{level}
             */

            List<Skill> skills = session.selectList("skill.dynamicSQL2", param);

            for (Skill skill : skills) {
                System.out.println(skill);
            }
        }
    }

    @Test
    public void batchInsert() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {

            List<Skill> skills = new ArrayList<>();
            skills.add(new Skill("Java1", 111));
            skills.add(new Skill("Java2", 222));
            skills.add(new Skill("Java3", 333));
            skills.add(new Skill("Java4", 444));

            session.insert("skill.batchInsert", skills);

            for (Skill skill : skills) {
                System.out.println(skill.getId());
            }

            session.commit();
        }
    }

    @Test
    public void batchDelete() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {

//            List<Integer> ids = new ArrayList<>();
//            ids.add(23);
//            ids.add(24);
//            ids.add(25);
//            ids.add(26);

            Integer[] ids = {23, 24, 25, 26};

            session.insert("skill.batchDelete2", ids);

            session.commit();
        }
    }

    @Test
    public void page() throws Exception {
        try (SqlSession session = MyBatises.openSession()) {
            PageHelper.startPage(2, 5);
            List<Skill> skills = session.selectList("skill.list");
            for (Skill skill : skills) {
                System.out.println(skill);
            }
        }
    }
}
