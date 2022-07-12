package com.mj;

import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TestParam {
    public void run(String name, int age) {}

    @Test
    public void test() throws Exception {
        Method method = TestParam.class.getMethod("run", String.class, int.class);
        for (Parameter parameter : method.getParameters()) {
            System.out.println(parameter.getName());
        }
    }
}
