package com.mj;

import com.mj.bean.Person;
import com.mj.dao.PersonDao;
import com.mj.util.MyBatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class PersonTest {
    @Test
    public void get() {
        try (SqlSession session = MyBatises.openSession()) {
            // 生成SkillDao的代理对象
            PersonDao dao = session.getMapper(PersonDao.class);
            Person person = dao.get(1);
            person.getBankCards();
        }
    }

    @Test
    public void list() {
        try (SqlSession session = MyBatises.openSession()) {
            // 生成SkillDao的代理对象
            PersonDao dao = session.getMapper(PersonDao.class);
            System.out.println(dao.list());
        }
    }
}
