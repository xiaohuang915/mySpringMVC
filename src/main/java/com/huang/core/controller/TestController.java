package com.huang.core.controller;

import com.huang.annotation.MyController;
import com.huang.annotation.MyRequestMapping;
import com.huang.annotation.MyRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: pc.huang
 * @Date: 2018/7/19 14:28
 * @Description:
 */
@MyController
@MyRequestMapping("/test")
public class TestController {
    @MyRequestMapping("/add")
    public void test(HttpServletRequest request, HttpServletResponse response,@MyRequestParam("param") String param){
        try {
            response.setContentType("text/html;charset=UTF-8");
            response.getWriter().write("测试成功 参数="+param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
