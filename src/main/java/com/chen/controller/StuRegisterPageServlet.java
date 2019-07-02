package com.chen.controller;

import com.chen.utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenyam
 * @title: ${NAME}
 * @projectName javaweb
 * @description: 跳转学生注册页面
 * @date 2019/7/2 0:03
 */
public class StuRegisterPageServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher(Constant.Page.PAGE_PATH+"stuRegisterPage.jsp").forward(req,resp);
    }
}
