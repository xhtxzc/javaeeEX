<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/28
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="registerVerify" action="${pageContext.request.contextPath}/register/verify" method="post">
    邮箱：<form:input  path="email" value="${registerEmail}" readonly="true" /><br>
    验证码：<form:input path="code" />
    <input type="submit">
</form:form>
</body>
</html>
