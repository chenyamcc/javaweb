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
 * @description: 更新学生servlet
 * @date 2019/7/1 21:46
 */
public class UpdateStudentServlet extends HttpServlet {
    private StudentService service = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //封装数据
        Map<String, String[]> parameterMap = req.getParameterMap();
        Student student = new Student();
        try {
            BeanUtils.populate(student,parameterMap);
            //添加学生数据
            service.updateOne(student);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //重定向主页
        resp.sendRedirect("indexPage.action");
    }
}
