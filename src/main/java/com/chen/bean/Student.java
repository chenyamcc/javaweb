package com.chen.bean;

/**
 * @author chenyam
 * @title: Student
 * @projectName javaweb
 * @description: 学生类
 * @date 2019/7/1 20:39
 */
public class Student {
    private Integer id;
    private String sno;
    private String name;
    private Integer sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
