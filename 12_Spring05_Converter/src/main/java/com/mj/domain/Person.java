package com.mj.domain;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class Person {
    private Date birthday;

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "birthday=" + birthday +
                '}';
    }
}
