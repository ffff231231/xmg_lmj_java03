package com.mj.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class TestController {
    @RequestMapping("/test1")
    @ResponseBody
    public String test1(@RequestParam Map<String, Object> map,
                       // String[] hobby,
                        @RequestParam List<String> hobby) {
        System.out.println(map);
        for (String s : hobby) {
            System.out.println(s);
        }
        return "success!";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test2(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        return " test2 success!";
    }

    @RequestMapping("/test3")
    @ResponseBody
    public String test3(String username,
                        MultipartFile photo,
                        HttpServletRequest request) throws Exception {
        System.out.println(username);

        // 将文件数据写入具体的位置
        String filename = photo.getOriginalFilename();
        String path = request.getServletContext().getRealPath("upload/img" + filename);
        File file = new File(path);
        photo.transferTo(file);
        System.out.println(photo);
        return " test3 success!";
    }

    @RequestMapping("/test4")
    @ResponseBody
    public String test4(String username,
                        MultipartFile[] photos) throws Exception {
        System.out.println(username);
        for (MultipartFile photo : photos) {
            System.out.println(photo.getOriginalFilename());
        }
        return " test4 success!";
    }

    @RequestMapping("/test5")
    @ResponseBody
    public String test5(Date birthday) {
        System.out.println(birthday);
        return " test5 success!";
    }
}
