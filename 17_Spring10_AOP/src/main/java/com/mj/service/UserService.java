package com.mj.service;

/**
 * @author 贾登辉
 * @version 1.0
 */
public interface UserService {
    boolean login(String username, Integer password);

    boolean register(String username, Integer password);

}
