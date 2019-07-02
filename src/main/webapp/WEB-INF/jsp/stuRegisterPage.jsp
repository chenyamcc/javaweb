<%--
  Created by IntelliJ IDEA.
  User: chenyam
  Date: 2019/7/1
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生注册页面</title>
</head>
<body>
    <form action="stuRegister.action" method="post">
        姓名:<input type="text" name="name" ><br/>
        学号:<input type="text" name="sno" ><br/>
        性别:<input type="radio" name="sex" value="1" >男
        <input type="radio" name="sex" value="0" >女<br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
