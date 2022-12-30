<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/12/29
  Time: 22:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
你好！${personalData.name}<br>
<a href="${pageContext.request.contextPath}/fow/app/${personalData.id}">提交申请</a><br>
<a href="${pageContext.request.contextPath}/fow/info/${personalData.id}">修改资料</a><br>
<a href="${pageContext.request.contextPath}/fow/ros/${personalData.id}">查看排班</a><br>
</body>
</html>
