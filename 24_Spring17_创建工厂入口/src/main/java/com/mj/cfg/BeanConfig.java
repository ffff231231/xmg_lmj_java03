package com.mj.cfg;

import com.mj.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 贾登辉
 * @version 1.0
 */
@Configuration
@ComponentScan("com.mj")
public class BeanConfig {

    @Bean
    public UserServiceImpl userService() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setName("@Bean");
        return userService;
    }

}
