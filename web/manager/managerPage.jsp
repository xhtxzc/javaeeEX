<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/12/31
  Time: 1:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
你好！${personalData.name}<br>
<a href="${pageContext.request.contextPath}/fow/acp/${personalData.id}">提交申请</a><br>
<a href="${pageContext.request.contextPath}/fow/see/${personalData.id}">查看排班</a><br>
</body>
</html>
