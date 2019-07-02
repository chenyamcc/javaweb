package com.chen.controller;

import com.chen.bean.Teacher;
import com.chen.service.TeacherService;
import com.chen.service.impl.TeacherServiceImpl;
import com.chen.utils.Constant;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenyam
 * @title: LoginServlet
 * @projectName javaweb
 * @description:  老师的控制层
 * @date 2019/6/26 19:21
 */
public class LoginServlet extends HttpServlet {
    private TeacherService service = new TeacherServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        String username = req.getParameter("userName");
        String password = req.getParameter("passWord");
        Teacher teacher = service.login(username, password);
        if (teacher != null) {
            //登陆成功，重定向到主页
            req.getSession().setAttribute("teacherName",teacher.getName());
            resp.sendRedirect("indexPage.action");
        }else {
            //登陆失败，提示信息，转发到登陆页面
            req.setAttribute("msg","用户名或密码错误");
            req.getRequestDispatcher(Constant.Page.PAGE_PATH+"login.jsp").forward(req,resp);
        }
    }
}
