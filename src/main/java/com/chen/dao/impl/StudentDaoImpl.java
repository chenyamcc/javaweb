package com.chen.dao.impl;

import com.chen.bean.Student;
import com.chen.dao.StudentDao;
import com.chen.utils.DruidUntils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author chenyam
 * @title: StudentDaoImpl
 * @projectName javaweb
 * @description: 学生的数据访问接口
 * @date 2019/7/1 20:44
 */
public class StudentDaoImpl implements StudentDao {
    private QueryRunner runner = new QueryRunner();
    @Override
    public List<Student> findAllStudent() {
        Connection conn = DruidUntils.getConnection();
        String sql = " select * from t_student";
        List<Student> list = null;
        try {
             list = runner.query(conn, sql, new BeanListHandler<>(Student.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DruidUntils.close(conn);
        return list;
    }

    @Override
    public Student findOne(int id) {
        Connection conn = DruidUntils.getConnection();
        String sql  ="select * from t_student where id = ?";
        Student student = null;
        try {
            student = runner.query(conn,sql,new BeanHandler<>(Student.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DruidUntils.close(conn);
        return student;
    }

    @Override
    public void updateOne(Student student) {
        Connection conn = DruidUntils.getConnection();
        String sql = "update t_student set name=?,sex=?,sno=? where id=?";
        Object[] objects = {student.getName(),student.getSex(),student.getSno(),student.getId()};
        try {
            runner.update(conn,sql,objects);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DruidUntils.close(conn);
    }

    @Override
    public void deleteOne(int id) {
        Connection conn = DruidUntils.getConnection();
        String sql = "delete from t_student where id=?";
        try {
            runner.update(conn,sql,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DruidUntils.close(conn);
    }

    @Override
    public void insertOne(Student student) {
        Connection conn = DruidUntils.getConnection();
        String sql ="insert into t_student(name,sex,sno) values(?,?,?)";
        Object[] objects ={ student.getName(),student.getSex(),student.getSno()};
        try {
            runner.update(conn,sql,objects);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DruidUntils.close(conn);
    }
}
