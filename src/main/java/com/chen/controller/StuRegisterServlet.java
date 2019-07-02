package com.chen.controller;

import com.chen.bean.Student;
import com.chen.service.StudentService;
import com.chen.service.impl.StudentServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author chenyam
 * @title: ${NAME}
 * @projectName javaweb
 * @description: 添加学生
 * @date 2019/7/2 0:11
 */
public class StuRegisterServlet extends HttpServlet {
    private StudentService service = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> map = req.getParameterMap();
        Student student = new Student();
        try {
            BeanUtils.populate(student,map);
            service.insertOne(student);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("indexPage.action");
    }
}
