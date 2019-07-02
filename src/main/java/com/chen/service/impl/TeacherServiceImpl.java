package com.chen.service.impl;

import com.chen.bean.Teacher;
import com.chen.dao.TeacherDao;
import com.chen.dao.impl.TeacherDaoImpl;
import com.chen.service.TeacherService;

/**
 * @author chenyam
 * @title: TeacherServiceImpl
 * @projectName javaweb
 * @description: 老师的业务层
 * @date 2019/6/26 19:27
 */
public class TeacherServiceImpl implements TeacherService {
    private TeacherDao dao = new TeacherDaoImpl();
    @Override
    public Teacher login(String username, String password) {
        //账户和密码都不为null且不为空串
        if (username !=null && !username.equals("")
            && password!=null && !password.equals("")){
            //调用dao进行查询
            Teacher login = dao.findTeacherByName(username);
            //账户该密码都正确，返回此对象，否则返回null
            if (login.getPassWord().equals(password)){
                System.out.println(login);
                return login;
            }
        }
        return null;
    }

    @Override
    public boolean register(Teacher teacher) {
        //查询name是否存在重复
        Teacher getTeahcer = dao.findTeacherByName(teacher.getUserName());
        if (getTeahcer != null) {
            return false;
        }else {
            int update = dao.addTeacher(teacher);
            return update > 0;
        }

    }
}
