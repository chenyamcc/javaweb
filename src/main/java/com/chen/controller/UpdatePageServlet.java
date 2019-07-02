package com.chen.controller;

import com.chen.bean.Student;
import com.chen.service.StudentService;
import com.chen.service.impl.StudentServiceImpl;
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
 * @description: 跳转更新学生页面
 * @date 2019/7/1 21:27
 */
public class UpdatePageServlet extends HttpServlet {
    private StudentService service = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Student student = service.findOne(id);
        req.setAttribute("student",student);
        req.getRequestDispatcher(Constant.Page.PAGE_PATH+"update.jsp").forward(req,resp);
    }
}
