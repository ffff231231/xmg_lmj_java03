package com.mj.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class LogProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object target, String beanName) throws BeansException {
        return Proxy.newProxyInstance(
                getClass().getClassLoader(), // 类加载器
                target.getClass().getInterfaces(),// 代理类需要实现的接口（目标类的接口）
                new LogInvocationHandler(target)); // 附加代码（代理类的具体实现）
    }

    private static class LogInvocationHandler implements InvocationHandler {
        private final Object target;
        public LogInvocationHandler(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // proxy: 代理对象
            // method: 目标方法
            // args: 目标方法的参数

            System.out.println("proxy - 1");

            // 调用目标对象的目标方法（核心业务代码）
            Object result = method.invoke(target, args);

            System.out.println("proxy - 2");

            return result;
        }
    }
}
