package com.chen.dao;

import com.chen.bean.Student;

import java.util.List;

/**
 * @author chenyam
 * @title: StudentDao
 * @projectName javaweb
 * @description: 学生数据访问接口
 * @date 2019/7/1 20:43
 */
public interface StudentDao {
    /**
     * 功能描述: 查询所有学生
     * @return: java.util.List<com.chen.bean.Student>
     * @Author: chenyam
     * @Date: 2019/7/1 20:44
    */
    List<Student> findAllStudent();

    /**
     * 功能描述: 根据学生id查询
     * @param id id
     * @return: com.chen.bean.Student
     * @Author: chenyam
     * @Date: 2019/7/1 21:33
    */
    Student findOne(int id);
    /**
     * 功能描述:添加学生
     * @param student student
     * @return: void
     * @Author: chenyam
     * @Date: 2019/7/1 23:26
    */
    void updateOne(Student student);

    /**
     * 功能描述: 根据id删除学生
     * @param id id
     * @return: void
     * @Author: chenyam
     * @Date: 2019/7/1 23:53
    */
    void deleteOne(int id);

    /**
     * 功能描述:添加学生
     * @param student stu
     * @return: void
     * @Author: chenyam
     * @Date: 2019/7/2 0:13
    */
    void insertOne(Student student);
}
