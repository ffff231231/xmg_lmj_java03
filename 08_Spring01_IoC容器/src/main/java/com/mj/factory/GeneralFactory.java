package com.mj.factory;


import java.io.InputStream;
import java.util.Properties;

/**
 * @author 贾登辉
 * @version 1.0
 */
public class GeneralFactory {
    private static Properties properties;

    static {
        try (InputStream is = GeneralFactory.class.getClassLoader().getResourceAsStream("factory.properties")) {
            properties = new Properties();
            properties.load(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> T get(String name) {
        try {
            // 类名
            String clsName = properties.getProperty(name);
            Class<?> cls = Class.forName(clsName);
            // 实例化对象
            return (T) cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
