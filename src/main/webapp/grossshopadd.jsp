<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/20 0020
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>进货单</title>
</head>
<body>
<h1>进货单</h1>
<form name="grossshopForm" action="${pageContext.request.contextPath}/grossshop/grossshopadd" method="post">
    客户名称:<input type="text" name="kuser"><br>
    客户类别:<input type="text" name="khlb"><br>
    图书编号:<input type="text" name="bookid"><br>
    图书名称:<input type="text" name="bookname"><br>
    图书商品款号:<input type="text" name="bookshopid"><br>
    图书年份:<input type="text" name="bookage"><br>
    图书类别:<input type="text" name="bboklb"><br>
    进货数量:<input type="text" name="jhsl"><br>
    进货金额:<input type="text" name="jhje"><br>
    进货总数量:<input type="text" name="jhzsl"><br>
    进货时间:<input type="text" name="jhtime"><br>
    创建时间:<input type="text" name="createtimes"><br>
    管理员:<input type="text" name="namesss"><br>
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
