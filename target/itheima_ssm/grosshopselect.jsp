<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/22 0022
  Time: 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询操作</title>
</head>
<body>
<h1>查询</h1>
<form action="${pageContext.request.contextPath}/grossshop/grosshopselect" method="post">
    <input type="text" name="userid"><br>
    <input type="submit" value="查询">
</form>
</body>
</html>
