<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/12 0012
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>删除账户信息表单</h1>
<form action="${pageContext.request.contextPath}/account/delete" method="post">
    账户id：<input type="text" name="id"><br>
    <input type="submit" value="删除"><br>
</form>
</body>
</html>

