package com.mj.test;

import com.mj.bean.BankCard;
import com.mj.bean.Job;
import com.mj.bean.Person;
import com.mj.util.MyBatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class ManyToMany {

    @Test
    public void personGet() {
        try (SqlSession session = MyBatises.openSession()) {
            Person person = session.selectOne("person.get", 1);
            System.out.println(person.getIdCard().getNo());
            //System.out.println(person);
        }
    }

}
