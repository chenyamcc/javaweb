package com.chen.controller;

import com.chen.utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenyam
 * @title: LoginPageServlet
 * @projectName javaweb
 * @description: 跳转登陆页面
 * @date 2019/7/1 16:42
 */
public class LoginPageServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(Constant.Page.PAGE_PATH+"login.jsp").forward(req,resp);
    }

}
