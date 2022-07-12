package com.mj.view;

import org.springframework.web.servlet.view.InternalResourceView;

import java.io.File;
import java.util.Locale;

public class MyView extends InternalResourceView {
    @Override
    public boolean checkResource(Locale locale) throws Exception {
        // 根据实际情况来返回
        // 存在, 返回true
        // 不存在, 返回false
        String path = getServletContext().getRealPath("/") + getUrl();
        File file = new File(path);
        return file.exists();
    }
}

