package com.chen.dao;

import com.chen.bean.Teacher;

/**
 * @author chenyam
 * @title: TeacherDao
 * @projectName javaweb
 * @description:  老师的数据访问层接口
 * @date 2019/6/26 19:26
 */
public interface TeacherDao {
    /**
     * 功能描述:
     * @param username 老师的账户
     * @return: void
     * @Author: chenyam
     * @Date: 2019/6/26 20:07
    */
    Teacher findTeacherByName(String username);

    /**
     * 功能描述: 将新建的账户添加进数据库
     * @param teacher 账户的信息
     * @return: boolean
     * @Author: chenyam
     * @Date: 2019/6/27 8:49
    */
    int addTeacher(Teacher teacher);
}
