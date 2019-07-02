<%--
  Created by IntelliJ IDEA.
  User: chenyam
  Date: 2019/7/1
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h2>
    欢迎${teacherName}登陆
</h2>
<a href="stuRegisterPage.action">添加学生</a>
<table border="1" align="center" width="50%">
    <tr>
        <td>姓名</td>
        <td>性别</td>
        <td>学号</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${stuList}" var="student">
        <tr>
            <td>${student.name}</td>
            <td>${student.sex}</td>
            <td>${student.sno}</td>
            <td>
                <a href="updatePage.action?id=${student.id}">修改</a>
                <a href="deleteStudent.action?id=${student.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
