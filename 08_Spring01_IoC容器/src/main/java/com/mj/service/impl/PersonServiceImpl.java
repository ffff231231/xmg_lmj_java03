package com.mj.service.impl;

import com.mj.dao.PersonDao;
import com.mj.factory.GeneralFactory;
import com.mj.service.PersonService;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class PersonServiceImpl implements PersonService {
    // private PersonDao dao = GeneralFactory.get("personDao");
    private PersonDao dao;

    public void setDao(PersonDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean remove(Integer id) {
        return dao.remove(id);
    }
}
