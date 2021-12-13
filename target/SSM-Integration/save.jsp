<%--
  Created by IntelliJ IDEA.
  User: 2948
  Date: 2021/12/13
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加账户信息</h1>
<form action="${pageContext.request.contextPath}/account/save" method="post">
    用户名：<input type="text" name="name" /> <br />
    金额：<input type="number" name="money" /><br />
    <button type="submit">提交</button>
</form>
</body>
</html>
