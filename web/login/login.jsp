<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/12/21
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/login/login" method="post">
    <label>工号</label><input type="text" name="account">
    <label>密码</label><input type="text" name="password">
    <input type="submit" name="login" value="登录" >
</form>
</body>
</html>
