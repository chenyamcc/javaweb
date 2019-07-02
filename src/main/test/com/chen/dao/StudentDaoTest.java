package com.chen.dao;

import com.chen.bean.Student;
import com.chen.dao.impl.StudentDaoImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author chenyam
 * @title: StudentDaoTest
 * @projectName javaweb
 * @description: TODO
 * @date 2019/7/1 21:13
 */
public class StudentDaoTest {

    @Test
    public void findAllStudent() {
        StudentDao dao = new StudentDaoImpl();
        List<Student> allStudent = dao.findAllStudent();
        System.out.println(allStudent);
    }
}