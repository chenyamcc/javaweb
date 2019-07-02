package com.chen.controller;

import com.chen.service.StudentService;
import com.chen.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenyam
 * @title: ${NAME}
 * @projectName javaweb
 * @description: 删除学生servlet
 * @date 2019/7/1 23:50
 */
public class DeleteStudentServlet extends HttpServlet {
    private StudentService service = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //删除学生
        int id = Integer.parseInt(req.getParameter("id"));
        service.deleteOne(id);
        //重定向到跳转主页的servlet
        resp.sendRedirect("indexPage.action");
    }
}
