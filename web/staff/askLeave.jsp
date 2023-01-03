<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/1/4
  Time: 0:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/staff/askLeave" method="post">
    用户：<input name="id" readonly value="${userId}">
    <input name="time" readonly style="display: none" value="${time}">
    请求时间：<input  readonly value="
                <c:if test="${time==1}">周一8:00-10:00</c:if>
                <c:if test="${time==2}">周一10:00-12:00</c:if>
                <c:if test="${time==3}">周一12:00-14:00</c:if>
                <c:if test="${time==4}">周一14:00-16:00</c:if>
                <c:if test="${time==5}">周一16:00-18:00</c:if>
                <c:if test="${time==6}">周一18:00-20:00</c:if>
                <c:if test="${time==7}"> 周二8:00-10:00</c:if>
                <c:if test="${time==8}"> 周二10:00-12:00</c:if>
                <c:if test="${time==9}"> 周二12:00-14:00</c:if>
                <c:if test="${time==10}">周二14:00-16:00</c:if>
                <c:if test="${time==11}">周二16:00-18:00</c:if>
                <c:if test="${time==12}">周二18:00-20:00</c:if>
                <c:if test="${time==13}">周三8:00-10:00</c:if>
                <c:if test="${time==14}">周三10:00-12:00</c:if>
                <c:if test="${time==15}">周三12:00-14:00</c:if>
                <c:if test="${time==16}">周三14:00-16:00</c:if>
                <c:if test="${time==17}">周三16:00-18:00</c:if>
                <c:if test="${time==18}">周三18:00-20:00</c:if>
                <c:if test="${time==19}">周四8:00-10:00</c:if>
                <c:if test="${time==20}">周四10:00-12:00</c:if>
                <c:if test="${time==21}">周四12:00-14:00</c:if>
                <c:if test="${time==22}">周四14:00-16:00</c:if>
                <c:if test="${time==23}">周四16:00-18:00</c:if>
                <c:if test="${time==24}">周四18:00-20:00</c:if>
                <c:if test="${time==25}">周五8:00-10:00</c:if>
                <c:if test="${time==26}">周五10:00-12:00</c:if>
                <c:if test="${time==27}">周五12:00-14:00</c:if>
                <c:if test="${time==28}">周五14:00-16:00</c:if>
                <c:if test="${time==29}">周五16:00-18:00</c:if>
                <c:if test="${time==30}">周五18:00-20:00</c:if>
                <c:if test="${time==31}">周六8:00-10:00</c:if>
                <c:if test="${time==32}">周六10:00-12:00</c:if>
                <c:if test="${time==33}">周六12:00-14:00</c:if>
                <c:if test="${time==34}">周六14:00-16:00</c:if>
                <c:if test="${time==35}">周六16:00-18:00</c:if>
                <c:if test="${time==36}">周六18:00-20:00</c:if>
                <c:if test="${time==37}">周日8:00-10:00</c:if>
                <c:if test="${time==38}">周日10:00-12:00</c:if>
                <c:if test="${time==39}">周日12:00-14:00</c:if>
                <c:if test="${time==40}">周日14:00-16:00</c:if>
                <c:if test="${time==41}">周日16:00-18:00</c:if>
                <c:if test="${time==42}">周日18:00-20:00</c:if>">
    请求理由：<textarea name="information"></textarea>
    <input type="submit">
</form>
</body>
</html>
