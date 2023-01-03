<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/12/31
  Time: 1:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>姓名</td>
        <td>时间</td>
        <td>类型</td>
        <td>理由</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${subs}" var="sub">
        <tr>
            <td>${sub.name}</td>
            <td><c:if test="${sub.time==1}">周一8:00-10:00</c:if>
                <c:if test="${sub.time==2}">周一10:00-12:00</c:if>
                <c:if test="${sub.time==3}">周一12:00-14:00</c:if>
                <c:if test="${sub.time==4}">周一14:00-16:00</c:if>
                <c:if test="${sub.time==5}">周一16:00-18:00</c:if>
                <c:if test="${sub.time==6}">周一18:00-20:00</c:if>
                <c:if test="${sub.time==7}"> 周二8:00-10:00</c:if>
                <c:if test="${sub.time==8}"> 周二10:00-12:00</c:if>
                <c:if test="${sub.time==9}"> 周二12:00-14:00</c:if>
                <c:if test="${sub.time==10}">周二14:00-16:00</c:if>
                <c:if test="${sub.time==11}">周二16:00-18:00</c:if>
                <c:if test="${sub.time==12}">周二18:00-20:00</c:if>
                <c:if test="${sub.time==13}">周三8:00-10:00</c:if>
                <c:if test="${sub.time==14}">周三10:00-12:00</c:if>
                <c:if test="${sub.time==15}">周三12:00-14:00</c:if>
                <c:if test="${sub.time==16}">周三14:00-16:00</c:if>
                <c:if test="${sub.time==17}">周三16:00-18:00</c:if>
                <c:if test="${sub.time==18}">周三18:00-20:00</c:if>
                <c:if test="${sub.time==19}">周四8:00-10:00</c:if>
                <c:if test="${sub.time==20}">周四10:00-12:00</c:if>
                <c:if test="${sub.time==21}">周四12:00-14:00</c:if>
                <c:if test="${sub.time==22}">周四14:00-16:00</c:if>
                <c:if test="${sub.time==23}">周四16:00-18:00</c:if>
                <c:if test="${sub.time==24}">周四18:00-20:00</c:if>
                <c:if test="${sub.time==25}">周五8:00-10:00</c:if>
                <c:if test="${sub.time==26}">周五10:00-12:00</c:if>
                <c:if test="${sub.time==27}">周五12:00-14:00</c:if>
                <c:if test="${sub.time==28}">周五14:00-16:00</c:if>
                <c:if test="${sub.time==29}">周五16:00-18:00</c:if>
                <c:if test="${sub.time==30}">周五18:00-20:00</c:if>
                <c:if test="${sub.time==31}">周六8:00-10:00</c:if>
                <c:if test="${sub.time==32}">周六10:00-12:00</c:if>
                <c:if test="${sub.time==33}">周六12:00-14:00</c:if>
                <c:if test="${sub.time==34}">周六14:00-16:00</c:if>
                <c:if test="${sub.time==35}">周六16:00-18:00</c:if>
                <c:if test="${sub.time==36}">周六18:00-20:00</c:if>
                <c:if test="${sub.time==37}">周日8:00-10:00</c:if>
                <c:if test="${sub.time==38}">周日10:00-12:00</c:if>
                <c:if test="${sub.time==39}">周日12:00-14:00</c:if>
                <c:if test="${sub.time==40}">周日14:00-16:00</c:if>
                <c:if test="${sub.time==41}">周日16:00-18:00</c:if>
                <c:if test="${sub.time==42}">周日18:00-20:00</c:if></td>
            <td><c:if test="${sub.type == 0}">请假</c:if><c:if test="${sub.type == 1}">换班</c:if></td>
            <td>${sub.information}</td>
            <td><a href="${pageContext.request.contextPath}/manager/refuse/${sub.number}/${personalData.id}">拒绝</a><a href="${pageContext.request.contextPath}/manager/accept/${sub.number}/${personalData.id}">接受</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
