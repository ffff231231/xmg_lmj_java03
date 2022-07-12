package com.mj.dao;

import com.mj.bean.Job;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
public interface JobDao {
    @Select("SELECT j.* " +
            "FROM job j " +
            "JOIN person_job pj " +
            "ON j.id = pj.job_id AND pj.person_id = #{personId}")
    List<Job> getByPerson(Integer id);
}
