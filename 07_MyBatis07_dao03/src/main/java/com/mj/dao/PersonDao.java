package com.mj.dao;

import com.mj.bean.Person;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
public interface PersonDao {
    @Select("SELECT * FROM person WHERE id = #{id}")
    @Results(id = "get", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "name", column = "name"),
            /* 身份证 */
            @Result(
                    property = "idCard",
                    column = "id",
                    one = @One(fetchType = FetchType.LAZY, select = "com.mj.dao.IdCardDao.getByPerson")),
            /* 银行卡 */
            @Result(
                    property = "bankCards",
                    column = "id",
                    many = @Many(fetchType = FetchType.LAZY, select = "com.mj.dao.BankCardDao.getByPerson")),
            /* 工作 */
            @Result(
                    property = "jobs",
                    column = "id",
                    many = @Many(fetchType = FetchType.LAZY, select = "com.mj.dao.JobDao.getByPerson")),

    })
    Person get(Integer id);

    @Select("SELECT * FROM person")
    /* 引用id为get的@Results */
    @ResultMap("get")
    List<Person> list();
}
