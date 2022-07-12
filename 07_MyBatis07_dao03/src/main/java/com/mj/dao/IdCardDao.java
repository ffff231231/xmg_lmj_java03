package com.mj.dao;

import com.mj.bean.IdCard;
import org.apache.ibatis.annotations.Select;

/**
 * @author 贾登辉
 * @version 1.0
 */
public interface IdCardDao {
    @Select("SELECT * FROM id_card WHERE person_id = #{personId}")
    IdCard getByPerson(Integer id);
}
