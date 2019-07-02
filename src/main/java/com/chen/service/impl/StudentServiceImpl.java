package com.chen.service.impl;

import com.chen.bean.Student;
import com.chen.dao.StudentDao;
import com.chen.dao.impl.StudentDaoImpl;
import com.chen.service.StudentService;

import java.util.List;

/**
 * @author chenyam
 * @title: StudentServiceImpl
 * @projectName javaweb
 * @description: TODO
 * @date 2019/7/1 20:38
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao dao = new StudentDaoImpl();
    @Override
    public List<Student> findAllStudent() {
        return dao.findAllStudent();
    }

    @Override
    public Student findOne(int id) {
        return dao.findOne(id);
    }

    @Override
    public void updateOne(Student student) {
        dao.updateOne(student);
    }

    @Override
    public void deleteOne(int id) {
        dao.deleteOne(id);
    }

    @Override
    public void insertOne(Student student) {
        dao.insertOne(student);
    }
}
