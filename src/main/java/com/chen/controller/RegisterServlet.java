package com.chen.controller;

import com.chen.bean.Teacher;
import com.chen.service.TeacherService;
import com.chen.service.impl.TeacherServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author chenyam
 * @title: RegisterServlet
 * @projectName javaweb
 * @description: 注册controller层
 * @date 2019/6/26 21:43
 */
public class RegisterServlet extends HttpServlet{
    private TeacherService service= new TeacherServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Map<String, String[]> parameterMap = req.getParameterMap();
        Teacher teacher = new Teacher();
        PrintWriter writer = resp.getWriter();
        try {
            BeanUtils.populate(teacher,parameterMap);
            System.out.println(teacher);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        boolean boo = service.register(teacher);
        if (boo){
            writer.write("注册成功");
        }else {
            writer.write("注册失败");
        }
        writer.close();

    }
}
