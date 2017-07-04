<%--
  Created by IntelliJ IDEA.
  User: songxin07
  Date: 17/6/20
  Time: 下午3:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>首页</title>
    <style type="text/css">
        table{border-collapse:collapse;border-spacing:0;border-left:1px solid #888;border-top:1px solid #888;background:#efefef;}
        th,td{border-right:1px solid #888;border-bottom:1px solid #888;padding:5px 15px;}
        th{font-weight:bold;background:#ccc;}
    </style>
</head>
<body>
<%--欢迎[${sessionScope.user.username }]访问--%>
<%--sessionScope是EL表达式的隐式对象，sessionScope.user等同于session.getAttribute("name")，对应UserController中Login方法中得session.setAttribute("user", user)--%>
<c:out value="${sessionScope.user.username}" default="未登录"/>
<%--<br><br>${sessionScope}--%>
<%--<br><br>${requestScope}--%>
<br>
<table border="1">
    <tr>
        <th>书名</th><th>作者</th><th>价格</th>
    </tr>
    <c:forEach items="${requestScope.book_list }" var="book">
        <tr>
            <td>${book.name }</td>
            <td>${book.author }</td>
            <td>${book.price }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
