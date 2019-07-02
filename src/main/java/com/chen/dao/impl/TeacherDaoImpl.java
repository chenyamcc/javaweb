package com.chen.dao.impl;

import com.chen.bean.Teacher;
import com.chen.dao.TeacherDao;
import com.chen.utils.DruidUntils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author chenyam
 * @title: TeacherDaoImpl
 * @projectName javaweb
 * @description: 老师的数据访问层
 * @date 2019/6/26 19:27
 */
public class TeacherDaoImpl implements TeacherDao {
    private QueryRunner runner = new QueryRunner();

    @Override
    public Teacher findTeacherByName(String username) {
        Connection connection = DruidUntils.getConnection();
        String sql = "select * from t_teacher where username = ?";
        Teacher teacher = null;
        try {
            teacher = runner.query(connection, sql, new BeanHandler<>(Teacher.class), username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DruidUntils.close(connection);
        return teacher;
    }

    @Override
    public int addTeacher(Teacher teacher) {
        Connection connection = DruidUntils.getConnection();
        String sql = "insert into t_teacher(username,password,name,phonenum,sex) values(?,?,?,?,?)";
        Object[] objects = {teacher.getUserName(), teacher.getPassWord(), teacher.getName(), teacher.getPhoneNum(),
                teacher.getSex()};
        boolean boo = false;
        int update = 0;
        try {
            update = runner.update(connection, sql, objects);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DruidUntils.close(connection);
        System.out.println(update);
        return update;
    }
}
