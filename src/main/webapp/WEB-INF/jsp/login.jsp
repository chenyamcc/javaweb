<%--
  Created by IntelliJ IDEA.
  User: chenyam
  Date: 2019/7/1
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆页面</title>
    <script src="<c:url value="/js/jquery-3.2.1.min.js"/>"></script>
    <link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet">
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/js/myjs.js"/>"></script>
</head>
<style>
    @import url('https://fonts.googleapis.com/css?family=Mukta');
    @import "<c:url value="/css/mycss.css"/>";
    body{
        margin: 0;
    }
</style>
<body>
<div class="login-reg-panel">
    <div class="login-info-box">
        <h2>Have an account?</h2>
        <p>Lorem ipsum dolor sit amet</p>
        <label id="label-register" for="log-reg-show">Login</label>
        <input type="radio" name="active-log-panel" id="log-reg-show"  checked="checked">
    </div>

    <div class="register-info-box">
        <h2>Don't have an account?</h2>
        <p>Lorem ipsum dolor sit amet</p>
        <label id="label-login" for="log-login-show">Register</label>
        <input type="radio" name="active-log-panel" id="log-login-show">
    </div>

    <div class="white-panel">
        <div class="login-show">
            <h2>LOGIN</h2>
            <span>
                <p style="color: red">${msg}</p>
            </span>
            <form id="myform" action="login.action" method="post">
                    <input type="text"  name="userName"placeholder="UserName">
                    <input type="password" name="passWord" placeholder="Password">
                <input type="button" value="Login" onclick="buttonsubmit()">
            </form>
            <a href="">Forgot password?</a>
        </div>
        <div class="register-show">
            <h2>REGISTER</h2>
                <input type="text" placeholder="UserName">
                <input type="password" placeholder="Password">
                <input type="password" placeholder="Confirm Password">
            <input type="button" value="Register" onclick="window.location.href='register.html'">
        </div>
    </div>
</div>
</body>
</html>