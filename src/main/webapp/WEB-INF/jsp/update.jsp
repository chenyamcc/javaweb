<%--
  Created by IntelliJ IDEA.
  User: chenyam
  Date: 2019/7/1
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
    <form action="updateStudent.action" method="post">
        <input type="hidden" name="id" value="${student.id}">
        姓名:<input type="text" name="name" value="${student.name}"><br/>
        学号:<input type="text" name="sno" value="${student.sno}"><br/>
        性别:<input type="radio" name="sex" value="1" ${student.sex eq 1?"checked":""} >男
            <input type="radio" name="sex" value="0" ${student.sex eq 0?"checked":""}>女<br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
