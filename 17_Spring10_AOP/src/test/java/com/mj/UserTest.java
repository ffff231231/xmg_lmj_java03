package com.mj;

import com.mj.service.PersonService;
import com.mj.service.SkillService;
import com.mj.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class UserTest {
    @Test
    public void test() {
        // 创建容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 目标对象
        SkillService skillService = ctx.getBean("skillService", SkillService.class);
        skillService.save(null);

        UserService userService = ctx.getBean("userService", UserService.class);
        userService.login(null, null);
        userService.register(null, null);

        PersonService personService = ctx.getBean("personService", PersonService.class);
        personService.run(null, null);

        //关闭容器
        ctx.close();
    }
}
