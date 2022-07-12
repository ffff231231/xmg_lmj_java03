package com.mj.obj;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class ConnectionFactoryBean implements FactoryBean<Connection> {
    private String driverClass;
    private String url;
    private String username;
    private String password;

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String passWord) {
        this.password = passWord;
    }

    @Override
    public Connection getObject() throws Exception {
        Class.forName(driverClass);
        return DriverManager.getConnection(url, username, password);
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }
}
