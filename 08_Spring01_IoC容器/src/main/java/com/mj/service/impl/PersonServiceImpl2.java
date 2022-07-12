package com.mj.service.impl;

import com.mj.dao.PersonDao;
import com.mj.dao.impl.PersonDaoImpl;
import com.mj.service.PersonService;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class PersonServiceImpl2 implements PersonService {

    @Override
    public boolean remove(Integer id) {
        System.out.println("PersonServiceImpl2 - remove: " + id);
        return false;
    }
}
