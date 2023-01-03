<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/12/29
  Time: 22:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
----------------我的上班时间-----------------
<table>
    <tr>
        <td>时间</td>
        <td>请求换班</td>
        <td>请假</td>
    </tr>
    <c:forEach items="${ros}" var="r">
        <tr>
            <td>
                <c:if test="${r.time==1}">周一8:00-10:00</c:if>
                <c:if test="${r.time==2}">周一10:00-12:00</c:if>
                <c:if test="${r.time==3}">周一12:00-14:00</c:if>
                <c:if test="${r.time==4}">周一14:00-16:00</c:if>
                <c:if test="${r.time==5}">周一16:00-18:00</c:if>
                <c:if test="${r.time==6}">周一18:00-20:00</c:if>
                <c:if test="${r.time==7}"> 周二8:00-10:00</c:if>
                <c:if test="${r.time==8}"> 周二10:00-12:00</c:if>
                <c:if test="${r.time==9}"> 周二12:00-14:00</c:if>
                <c:if test="${r.time==10}">周二14:00-16:00</c:if>
                <c:if test="${r.time==11}">周二16:00-18:00</c:if>
                <c:if test="${r.time==12}">周二18:00-20:00</c:if>
                <c:if test="${r.time==13}">周三8:00-10:00</c:if>
                <c:if test="${r.time==14}">周三10:00-12:00</c:if>
                <c:if test="${r.time==15}">周三12:00-14:00</c:if>
                <c:if test="${r.time==16}">周三14:00-16:00</c:if>
                <c:if test="${r.time==17}">周三16:00-18:00</c:if>
                <c:if test="${r.time==18}">周三18:00-20:00</c:if>
                <c:if test="${r.time==19}">周四8:00-10:00</c:if>
                <c:if test="${r.time==20}">周四10:00-12:00</c:if>
                <c:if test="${r.time==21}">周四12:00-14:00</c:if>
                <c:if test="${r.time==22}">周四14:00-16:00</c:if>
                <c:if test="${r.time==23}">周四16:00-18:00</c:if>
                <c:if test="${r.time==24}">周四18:00-20:00</c:if>
                <c:if test="${r.time==25}">周五8:00-10:00</c:if>
                <c:if test="${r.time==26}">周五10:00-12:00</c:if>
                <c:if test="${r.time==27}">周五12:00-14:00</c:if>
                <c:if test="${r.time==28}">周五14:00-16:00</c:if>
                <c:if test="${r.time==29}">周五16:00-18:00</c:if>
                <c:if test="${r.time==30}">周五18:00-20:00</c:if>
                <c:if test="${r.time==31}">周六8:00-10:00</c:if>
                <c:if test="${r.time==32}">周六10:00-12:00</c:if>
                <c:if test="${r.time==33}">周六12:00-14:00</c:if>
                <c:if test="${r.time==34}">周六14:00-16:00</c:if>
                <c:if test="${r.time==35}">周六16:00-18:00</c:if>
                <c:if test="${r.time==36}">周六18:00-20:00</c:if>
                <c:if test="${r.time==37}">周日8:00-10:00</c:if>
                <c:if test="${r.time==38}">周日10:00-12:00</c:if>
                <c:if test="${r.time==39}">周日12:00-14:00</c:if>
                <c:if test="${r.time==40}">周日14:00-16:00</c:if>
                <c:if test="${r.time==41}">周日16:00-18:00</c:if>
                <c:if test="${r.time==42}">周日18:00-20:00</c:if>
            </td>
            <td><a href="${pageContext.request.contextPath}/fow/">请求换班</a></td>
            <td><a href="${pageContext.request.contextPath}/fow/askLeave/${personalData.id}/${r.time}">请假</a></td>
        </tr>
    </c:forEach>
</table>
----------------我的历史更改请求-----------------
<table>
    <tr>
        <td>类型</td>
        <td>时间</td>
        <td>内容</td>
        <td>是否通过</td>
        <td>审核人</td>
    </tr>
    <c:forEach items="${submits}" var="submit">
        <tr>
            <td><c:if test="${submit.type == 0}">请假</c:if><c:if test="${submit.type == 1}">换班</c:if></td>
            <td>
                <c:if test="${submit.time==1}">周一8:00-10:00</c:if>
                <c:if test="${submit.time==2}">周一10:00-12:00</c:if>
                <c:if test="${submit.time==3}">周一12:00-14:00</c:if>
                <c:if test="${submit.time==4}">周一14:00-16:00</c:if>
                <c:if test="${submit.time==5}">周一16:00-18:00</c:if>
                <c:if test="${submit.time==6}">周一18:00-20:00</c:if>
                <c:if test="${submit.time==7}"> 周二8:00-10:00</c:if>
                <c:if test="${submit.time==8}"> 周二10:00-12:00</c:if>
                <c:if test="${submit.time==9}"> 周二12:00-14:00</c:if>
                <c:if test="${submit.time==10}">周二14:00-16:00</c:if>
                <c:if test="${submit.time==11}">周二16:00-18:00</c:if>
                <c:if test="${submit.time==12}">周二18:00-20:00</c:if>
                <c:if test="${submit.time==13}">周三8:00-10:00</c:if>
                <c:if test="${submit.time==14}">周三10:00-12:00</c:if>
                <c:if test="${submit.time==15}">周三12:00-14:00</c:if>
                <c:if test="${submit.time==16}">周三14:00-16:00</c:if>
                <c:if test="${submit.time==17}">周三16:00-18:00</c:if>
                <c:if test="${submit.time==18}">周三18:00-20:00</c:if>
                <c:if test="${submit.time==19}">周四8:00-10:00</c:if>
                <c:if test="${submit.time==20}">周四10:00-12:00</c:if>
                <c:if test="${submit.time==21}">周四12:00-14:00</c:if>
                <c:if test="${submit.time==22}">周四14:00-16:00</c:if>
                <c:if test="${submit.time==23}">周四16:00-18:00</c:if>
                <c:if test="${submit.time==24}">周四18:00-20:00</c:if>
                <c:if test="${submit.time==25}">周五8:00-10:00</c:if>
                <c:if test="${submit.time==26}">周五10:00-12:00</c:if>
                <c:if test="${submit.time==27}">周五12:00-14:00</c:if>
                <c:if test="${submit.time==28}">周五14:00-16:00</c:if>
                <c:if test="${submit.time==29}">周五16:00-18:00</c:if>
                <c:if test="${submit.time==30}">周五18:00-20:00</c:if>
                <c:if test="${submit.time==31}">周六8:00-10:00</c:if>
                <c:if test="${submit.time==32}">周六10:00-12:00</c:if>
                <c:if test="${submit.time==33}">周六12:00-14:00</c:if>
                <c:if test="${submit.time==34}">周六14:00-16:00</c:if>
                <c:if test="${submit.time==35}">周六16:00-18:00</c:if>
                <c:if test="${submit.time==36}">周六18:00-20:00</c:if>
                <c:if test="${submit.time==37}">周日8:00-10:00</c:if>
                <c:if test="${submit.time==38}">周日10:00-12:00</c:if>
                <c:if test="${submit.time==39}">周日12:00-14:00</c:if>
                <c:if test="${submit.time==40}">周日14:00-16:00</c:if>
                <c:if test="${submit.time==41}">周日16:00-18:00</c:if>
                <c:if test="${submit.time==42}">周日18:00-20:00</c:if>
            </td>
            <td>${submit.information}</td>
            <td><c:if test="${submit.pass==0}">未审核</c:if><c:if test="${submit.pass==1}">通过</c:if><c:if test="${submit.pass==-1}">未通过</c:if> </td>
            <td>${submit.approval_name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
