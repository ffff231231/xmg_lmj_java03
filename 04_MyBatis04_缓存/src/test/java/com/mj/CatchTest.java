package com.mj;

import com.mj.bean.Job;
import com.mj.util.MyBatises;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class CatchTest {
    @Test
    public void firstLevel() {
        try (SqlSession session = MyBatises.openSession()) {
            Job job1 = session.selectOne("job.get", 1);
            System.out.println(job1);

            Job job = new Job();
            job.setName("宇航员");
            job.setDuty("上天");
            job.setId(1);
            session.update("job.update", job);

            Job job2 = session.selectOne("job.get", 1);
            System.out.println(job2);
        }
    }

    @Test
    public void secondLevel() {
        try (SqlSession session = MyBatises.openSession()) {
            Job job1 = session.selectOne("job.get", 1);
            System.out.println(job1 + "_" + job1.getName());
        }

        try (SqlSession session = MyBatises.openSession()) {
            Job job1 = session.selectOne("job.get", 1);
            System.out.println(job1 + "_" + job1.getName());
        }

        try (SqlSession session = MyBatises.openSession()) {
            Job job1 = session.selectOne("job.get", 1);
            job1.setName("MJ666");
            System.out.println(job1 + "_" + job1.getName());
        }

        try (SqlSession session = MyBatises.openSession()) {
            Job job1 = session.selectOne("job.get", 1);
            System.out.println(job1 + "_" + job1.getName());
        }
    }
}
