<%--
  Created by IntelliJ IDEA.
  User: chenyam
  Date: 2019/7/1
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
    <script src="<c:url value="/js/jquery-3.2.1.min.js"/>"></script>
    <link href="<c:url value="/css/bootstrap.min.css"/>" rel="stylesheet">
    <script src="<c:url value="/js/bootstrap.min.js"/>"></script>
    <script src="<c:url value="/js/myjs.js"/>"></script>
</head>
<style>
    @import url('https://fonts.googleapis.com/css?family=Mukta');
    @import "<c:url value="/css/mycss.css"/>";
</style>
<script src="${Path}/js/myjs.js"></script>
<div class="login-reg-panel">
    <div class="login-info-box">
        <h2>Have an account?</h2>
        <p>Lorem ipsum dolor sit amet</p>
        <label id="label-register" for="log-reg-show">Login</label>
        <input type="radio" name="active-log-panel" id="log-reg-show" checked="checked">
    </div>

    <div class="register-info-box">
        <h2> have an account?</h2>
        <p>Lorem ipsum dolor sit amet</p>
        <label id="label-login" for="log-login-show">Login</label>
        <input type="radio" name="active-log-panel" id="log-login-show">
    </div>

    <div class="white-panel">
        <div class="login-show">
            <h2>Register</h2>
            <form id="myform" action="register.action" method="post">
                    <input type="text" name="userName" placeholder="UserName">
                    <input type="password" name="passWord" placeholder="Password">
                    <input type="text" name="name" placeholder="Name">
                    <input type="text" name="phoneNum" placeholder="phoneNum">
                    <input type="text" name="sex" placeholder="Sex">
                <input type="button" value="Register" onclick="buttonsubmit()">
            </form>
        </div>
        <div class="register-show">
            <h2>REGISTER</h2>
            <label>
                <input type="text" placeholder="UserName">
            </label>
            <label>
                <input type="password" placeholder="Password">
            </label>
            <label>
                <input type="password" placeholder="Confirm Password">
            </label>
            <input type="button" value="Register" >
        </div>
    </div>
</div>
</body>
</html>
