<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/16 0016
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加角色</h1>
<form name="roleFrom" action="${pageContext.request.contextPath}/role/roleins" method="post">
    角色名称:<input type="text" name="rolename"><br>
    创建时间:<input type="text" name="roleadress"><br>
    审核人:<input type="text" name="namess"><br>
    <input type="submit" value="保存">
</form>
</body>
</html>
