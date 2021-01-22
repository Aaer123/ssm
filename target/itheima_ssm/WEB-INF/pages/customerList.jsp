<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户表</title>
</head>
<body>
<h1>客户表</h1>
<table border="1">
    <tr>
        <th>客户编号</th>
        <th>客户名称</th>
        <th>客户电话</th>
        <th>客户类别</th>
        <th>客户邮箱</th>
        <th>客户地址</th>
        <th>创建时间</th>
    </tr>

    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.userid}</td>
            <td>${customer.kuser}</td>
            <td>${customer.ktelphone}</td>
            <td>${customer.khlb}</td>
            <td>${customer.khemial}</td>
            <td>${customer.khagt}</td>
            <td>${customer.cjtime}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>