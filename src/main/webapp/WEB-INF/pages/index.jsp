<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/25 0025
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<h1>首页</h1>
<form action="${pageContext.request.contextPath}/user/findAlls"<%-- align="right"--%>>
    所有用户：<label>
    <input type="text">
</label>
    <input type="submit" value="查询">
</form>
<form action="${pageContext.request.contextPath}/storage/addStorageshop">
    搜索到客户ID查询进货单：<label>
    <input type="text" name="userid">
</label>
    <input type="submit" value="查询">
</form>
</body>
</html>
