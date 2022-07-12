package com.mj.dao;

import com.mj.bean.BankCard;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 贾登辉
 * @version 1.0
 */
public interface BankCardDao {
    @Select("SELECT * FROM bank_card WHERE person_id = #{personId}")
    List<BankCard> getByPerson(Integer id);
}
