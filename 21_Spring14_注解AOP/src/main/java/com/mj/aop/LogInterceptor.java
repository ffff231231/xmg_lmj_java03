package com.mj.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class LogInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("LogInterceptor---------------1");

        // 调用目标方法
        Object ret = invocation.proceed();

        System.out.println("LogInterceptor---------------2");
        return ret;
    }
}
