<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>进货单据</title>
</head>
<body>
<h1>进货单据</h1>
<table border="1" width="1000px";height="500px">
    <tr>
        <th>商品订单编号</th>
        <th>客户编号</th>
        <th>客户名称</th>
        <th>客户类别</th>
        <th>图书编号</th>
        <th>图书名称</th>
        <th>图书商品款号</th>
        <th>图书年份</th>
        <th>图书类别</th>
        <th>进货数量</th>
        <th>进货金额</th>
        <th>进货总数量</th>
        <th>进货时间</th>
        <th>创建时间</th>
        <th>管理员</th>
    </tr>
    <c:forEach var="grossshop" items="${grossShopList}">
        <tr>
            <td>${grossshop.ordergoods}</td>
            <td>${grossshop.userid}</td>
            <td>${grossshop.kuser}</td>
            <td>${grossshop.khlb}</td>
            <td>${grossshop.bookid}</td>
            <td>${grossshop.bookname}</td>
            <td>${grossshop.bookshopid}</td>
            <td>${grossshop.bookage}</td>
            <td>${grossshop.bboklb}</td>
            <td>${grossshop.jhsl}</td>
            <td>${grossshop.jhje}</td>
            <td>${grossshop.jhzsl}</td>
            <td>${grossshop.jhtime}</td>
            <td>${grossshop.createtimes}</td>
            <td>${grossshop.namesss}</td>
        </tr>
    </c:forEach>
</table>
</form>
</body>
</html>