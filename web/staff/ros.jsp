<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/12/29
  Time: 22:44
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
        <td>时间</td>
        <td>员工</td>
    </tr>
<c:forEach items="${ross.names}" var="groups" varStatus="status">
    <c:forEach items="${groups}" var="staff" >
    <tr>
        <td>
            <c:if test="${status.count==1}">周一8:00-10:00</c:if>
            <c:if test="${status.count==2}">周一10:00-12:00</c:if>
            <c:if test="${status.count==3}">周一12:00-14:00</c:if>
            <c:if test="${status.count==4}">周一14:00-16:00</c:if>
            <c:if test="${status.count==5}">周一16:00-18:00</c:if>
            <c:if test="${status.count==6}">周一18:00-20:00</c:if>
            <c:if test="${status.count==7}"> 周二8:00-10:00</c:if>
            <c:if test="${status.count==8}"> 周二10:00-12:00</c:if>
            <c:if test="${status.count==9}"> 周二12:00-14:00</c:if>
            <c:if test="${status.count==10}">周二14:00-16:00</c:if>
            <c:if test="${status.count==11}">周二16:00-18:00</c:if>
            <c:if test="${status.count==12}">周二18:00-20:00</c:if>
            <c:if test="${status.count==13}">周三8:00-10:00</c:if>
            <c:if test="${status.count==14}">周三10:00-12:00</c:if>
            <c:if test="${status.count==15}">周三12:00-14:00</c:if>
            <c:if test="${status.count==16}">周三14:00-16:00</c:if>
            <c:if test="${status.count==17}">周三16:00-18:00</c:if>
            <c:if test="${status.count==18}">周三18:00-20:00</c:if>
            <c:if test="${status.count==19}">周四8:00-10:00</c:if>
            <c:if test="${status.count==20}">周四10:00-12:00</c:if>
            <c:if test="${status.count==21}">周四12:00-14:00</c:if>
            <c:if test="${status.count==22}">周四14:00-16:00</c:if>
            <c:if test="${status.count==23}">周四16:00-18:00</c:if>
            <c:if test="${status.count==24}">周四18:00-20:00</c:if>
            <c:if test="${status.count==25}">周五8:00-10:00</c:if>
            <c:if test="${status.count==26}">周五10:00-12:00</c:if>
            <c:if test="${status.count==27}">周五12:00-14:00</c:if>
            <c:if test="${status.count==28}">周五14:00-16:00</c:if>
            <c:if test="${status.count==29}">周五16:00-18:00</c:if>
            <c:if test="${status.count==30}">周五18:00-20:00</c:if>
            <c:if test="${status.count==31}">周六8:00-10:00</c:if>
            <c:if test="${status.count==32}">周六10:00-12:00</c:if>
            <c:if test="${status.count==33}">周六12:00-14:00</c:if>
            <c:if test="${status.count==34}">周六14:00-16:00</c:if>
            <c:if test="${status.count==35}">周六16:00-18:00</c:if>
            <c:if test="${status.count==36}">周六18:00-20:00</c:if>
            <c:if test="${status.count==37}">周日8:00-10:00</c:if>
            <c:if test="${status.count==38}">周日10:00-12:00</c:if>
            <c:if test="${status.count==39}">周日12:00-14:00</c:if>
            <c:if test="${status.count==40}">周日14:00-16:00</c:if>
            <c:if test="${status.count==41}">周日16:00-18:00</c:if>
            <c:if test="${status.count==42}">周日18:00-20:00</c:if>
        </td>
        <td>
            ${staff}
        </td>
    </tr>
</c:forEach>
</c:forEach>
</table>
</body>
</html>
