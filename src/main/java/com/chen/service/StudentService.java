package com.chen.service;

import com.chen.bean.Student;

import java.util.List;

/**
 * @author chenyam
 * @title: StudentService
 * @projectName javaweb
 * @description: 学生业务接口
 * @date 2019/7/1 20:38
 */
public interface StudentService {
    /**
     * 功能描述: 查询所有学生
     * @return: java.util.List<com.chen.bean.Student>
     * @Author: chenyam
     * @Date: 2019/7/1 20:42
    */
    List<Student> findAllStudent();

    /**
     * 功能描述: 根据学生id查询
     * @param id id
     * @return: com.chen.bean.Student
     * @Author: chenyam
     * @Date: 2019/7/1 21:29
    */
    Student findOne(int id);

    /**
     * 功能描述:添加学生
     * @param student
     * @return: void
     * @Author: chenyam
     * @Date: 2019/7/1 23:25
    */
    void updateOne(Student student);

    /**
     * 功能描述:根据id 删除学生
     * @param id id
     * @return: void
     * @Author: chenyam
     * @Date: 2019/7/1 23:52
    */
    void deleteOne(int id);

    /**
     * 功能描述: 添加学生
     * @param student stu
     * @return: void
     * @Author: chenyam
     * @Date: 2019/7/2 0:13
    */
    void insertOne(Student student);
}
