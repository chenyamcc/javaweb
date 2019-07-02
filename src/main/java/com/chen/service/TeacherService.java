package com.chen.service;

import com.chen.bean.Teacher;

/**
 * @author chenyam
 * @title: TeacherService
 * @projectName javaweb
 * @description: 老师的业务层接口
 * @date 2019/6/26 19:26
 */
public interface TeacherService {
    /**
     * 功能描述: 老师的登陆功能
     * @param username 账户
     * @param password 密码
     * @return: com.chen.bean.Teacher
     * @Author: chenyam
     * @Date: 2019/6/26 20:18
    */
    Teacher login(String username,String password);

    /**
     * 功能描述: 老师的的注册功能
     * @param teacher 老师的所以信息
     * @return: boolean 是否注册成功
     * @Author: chenyam
     * @Date: 2019/6/27 8:46
    */
    boolean register(Teacher teacher);
}
