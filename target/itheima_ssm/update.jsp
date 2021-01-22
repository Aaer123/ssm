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
    <title>Title</title>
</head>
<body>
   <h1>修改账户信息表单</h1>
   <form action="${pageContext.request.contextPath}/account/update" method="post">
       账户名字：<input type="text" name="name"><br>
       账户金额：<input type="text" name="money"><br>
       <input type="submit" value="保存"><br>
   </form>
</body>
</html>
