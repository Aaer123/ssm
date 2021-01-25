<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/9 0009
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<h1>用户列表</h1>
<form action="${pageContext.request.contextPath}/user/seleces" method="post">
    用户编号：<input type="text" name="id"><br>
    <input type="submit" value="登录"><br>
</form>
</body>
</html>
