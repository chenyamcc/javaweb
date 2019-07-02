package com.chen.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author chenyam
 * @title: MyEncodingFilter
 * @projectName javaweb
 * @description: 对未登陆的用户跳转到登陆页面
 * @date 2019/7/1 19:47
 */
public class MyEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, javax.servlet.FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        boolean flag = false;
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String path = req.getRequestURI();
        String loginURL=req.getContextPath()+"/loginPage.action";
        HttpSession session = req.getSession();
        String name = (String) session.getAttribute("teacherName");
        //登陆页面放行
        if(loginURL.equals(path)){
            chain.doFilter(req,resp);
            return;
        }
        if (name == null){
            resp.sendRedirect("loginPage.action");
            return;
        }else {
            chain.doFilter(req,resp);
            return;
        }
    }


    @Override
    public void destroy() {

    }
}
