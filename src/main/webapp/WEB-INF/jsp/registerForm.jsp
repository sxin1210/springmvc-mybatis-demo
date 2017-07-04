<%--
  Created by IntelliJ IDEA.
  User: songxin07
  Date: 17/6/21
  Time: 上午11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
<h3>注册页面</h3>
<form action="register" method="post">
    <table>
        <tr>
            <td><label>登录名: </label></td>
            <td><input type="text" id="loginname" name="loginname" ></td>
        </tr>
        <tr>
            <td><label>密码: </label></td>
            <td><input type="password" id="password" name="password" ></td>
        </tr>
        <tr>
            <td><label>用户名: </label></td>
            <td><input type="text" id="username" name="username" ></td>
        </tr>
        <tr>
            <td><label>电话: </label></td>
            <td><input type="text" id="phone" name="phone" ></td>
        </tr>
        <tr>
            <td><label>地址: </label></td>
            <td><input type="text" id="address" name="address" ></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"></td>
        </tr>
    </table>
</form>
</body>
</html>
