<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/account/findAll">
    <label>
        <input type="text" name="id">
    </label><br>
    <input type="submit" value="查询"><br>
</form>
</body>
</html>