package com.mj.obj;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class ConnectionFactory {
    private String driverClass;
    private String url;
    private String username;
    private String passWord;

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    //    public static Connection getConn() throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
//        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test_mybatis", "root", "jdh");
//    }

    public Connection getConn() throws Exception {
        Class.forName(driverClass);
        return DriverManager.getConnection(url, username, passWord);
    }
}
