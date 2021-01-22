<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>删除</h1>
<form action="${pageContext.request.contextPath}/user/userDelete" method="post">
    用户名：<input type="text" name="username"><br>
    <input type="submit" value="删除"><br>
</form>
</body>
</html>
