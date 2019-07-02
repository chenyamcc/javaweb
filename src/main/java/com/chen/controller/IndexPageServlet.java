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
import java.util.List;

/**
 * @author chenyam
 * @title: ${NAME}
 * @projectName javaweb
 * @description: 跳转主页
 * @date 2019/7/1 20:25
 */
public class IndexPageServlet extends HttpServlet {
    private StudentService service = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //查询所有学生
        List<Student> students = service.findAllStudent();
        req.setAttribute("stuList",students);
        req.getRequestDispatcher(Constant.Page.PAGE_PATH+"index.jsp").forward(req,resp);
    }
}
