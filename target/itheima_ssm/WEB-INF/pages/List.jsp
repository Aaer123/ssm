<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<h1>用户列表</h1>
<table border="1" width="1000px";height="500px">
    <tr>
        <th>用户id</th>
        <th>用户账号</th>
        <th>用户密码</th>
    </tr>
        <tr>
            <td>${sessionScope.user.id}</td>
            <td>${sessionScope.user.username}</td>
            <td>${sessionScope.user.password}</td>
        </tr>
         <tr>
            <td>${sessionScope.user.id}</td>
            <td>${sessionScope.user.username}</td>
            <td>${sessionScope.user.password}</td>
         </tr>
</table>
</body>
</html>