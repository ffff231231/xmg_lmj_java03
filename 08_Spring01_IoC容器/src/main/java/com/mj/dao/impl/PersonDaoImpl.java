package com.mj.dao.impl;

import com.mj.dao.PersonDao;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class PersonDaoImpl implements PersonDao {



    @Override
    public boolean remove(Integer id) {
        System.out.println("PersonDaoImpl ------- remove: " + id);
        return false;
    }
}
