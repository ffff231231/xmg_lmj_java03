package com.mj.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class LogProcessor2 implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object target, String beanName) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(getClass().getClassLoader());
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new logMethodInterceptor(target));
        return enhancer.create();
    }

    private static class logMethodInterceptor implements MethodInterceptor {
        private final Object target;
        public logMethodInterceptor(Object target) {
            this.target = target;
        }

        @Override
        public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            System.out.println("proxy - 1");

            // 调用目标对象的目标方法（核心业务代码）
            Object result = method.invoke(target, args);

            System.out.println("proxy - 2");

            return result;
        }
    }

}
