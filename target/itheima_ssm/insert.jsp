<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加客户</title>
</head>
<body>
<h1>添加客户</h1>
<form name="customerFrom" action="${pageContext.request.contextPath}/customer/insert" method="post">
    客户名称：<input type="text" name="kuser"><br>
    客户电话：<input type="text" name="ktelphone"><br>
    客户类别：<input type="text" name="khlb"><br>
    客户邮箱：<input type="email" name="khemial"><br>
    客户地址：<input type="text" name="khagt"><br>
    客户创建时间：<input type="text" name="kcreatetime"><br>
    <input type="submit" value="保存"><br>
</form>
</body>
</html>
