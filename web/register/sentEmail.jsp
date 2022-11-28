<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/28
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>
        <label>注册邮箱：</label>
        <input id="userEmail"/>
    </p>
    <p>
        <button onclick="jump()">获取</button>
    </p>
</body>
<script>
    function jump() {
        let a = document.getElementById("userEmail").value;
        window.location.href="sent/"+a;
    }
</script>
</html>
