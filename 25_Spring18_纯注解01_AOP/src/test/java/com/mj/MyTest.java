package com.mj;

import com.mj.cfg.AppConfig;
import com.mj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService service = ctx.getBean("userService", UserService.class);
        service.list();
    }
}
