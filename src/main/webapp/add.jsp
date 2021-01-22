<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/22 0022
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>库存表</h1>
<form action="${pageContext.request.contextPath}/storage/addStorageshop">
    <input type="text" name="userid"><br>
    <input type="submit" value="查询">
</form>
</body>
</html>
