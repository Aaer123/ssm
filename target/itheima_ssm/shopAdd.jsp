<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加商品</h1>
<form name="shopFrom" action="${pageContext.request.contextPath}/shop/shopAdd" method="post">
    图书商品款号:<input type="text" name="bookshopid"><br>
    图书名称:<input type="text" name="bookname"><br>
    图书年份:<input type="text" name="bookage"><br>
    图书类别:<input type="text" name="booklb"><br>
    图书进货价:<input type="text" name="bookjprices"><br>
    图书促销价:<input type="text" name="pricesd"><br>
    图书来源地:<input type="text" name="home"><br>
    图书金额:<input type="text" name="pricedd"><br>
    图书数量:<input type="text" name="booksl"><br><br>
    上传图书图片:<input type="file" name="bookimage"><br><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
