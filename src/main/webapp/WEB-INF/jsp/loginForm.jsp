<%--
  Created by IntelliJ IDEA.
  User: songxin07
  Date: 17/6/20
  Time: 下午3:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" con tent="text/html; charset=UTF-8">
    <title>登录页面</title>
</head>
<body>
<h3>登录页面</h3>
<form action="login" method="post">
    <font color="red">${requestScope.message }</font>
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
            <td><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
