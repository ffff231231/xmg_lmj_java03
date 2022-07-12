package com.mj.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 贾登辉
 * @version 1.0
 */
@Aspect
@Component
public class DefaultAspect {

    @Pointcut("within(com.mj.service.impl.UserServiceImpl)")
    public void pc() {}

    @Around("pc()")
    public Object log(ProceedingJoinPoint point) throws Throwable {
        System.out.println("log---------------1");

        // 调用目标方法
        Object ret = point.proceed();

        System.out.println("log---------------2");
        return ret;
    }

    @Around("pc()")
    public Object watch(ProceedingJoinPoint point) throws Throwable {
        System.out.println("watch---------------1");

        // 调用目标方法
        Object ret = point.proceed();

        System.out.println("watch---------------2");
        return ret;
    }
}
