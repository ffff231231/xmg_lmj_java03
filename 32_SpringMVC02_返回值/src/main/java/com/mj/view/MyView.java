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

        // 项目部署的根路径 + /page/index.jsp
//        String path = getServletContext().getRealPath("/") + getUrl();

        // 项目部署的根路径 + /page/index.jsp  （与上面的代码功能是一样的）
        String path = getServletContext().getRealPath(getUrl());
        File file = new File(path);
        return file.exists();
    }
}

