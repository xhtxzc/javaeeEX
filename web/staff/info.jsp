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
<form action="" method="post">
    工号<input readonly value="${personalData.id}">
    姓名<input readonly value="${personalData.name}">
    邮箱<input readonly value="${personalData.email}">
    职位<input readonly value="<c:if test="${personalData.position=='staff'}">职员</c:if>
<c:if test="${personalData.position=='manager'}">经理</c:if>
<c:if test="${personalData.position=='dpManager'}">副经理</c:if>">
    <input type="submit" value="修改">
</form>
<form action="${pageContext.request.contextPath}/staff/alterDay/${personalData.id}" method="post">
    <table>
        <tr>
            <td>周一</td><td>周二</td><td>周三</td><td>周四</td><td>周五</td><td>周六</td><td>周日</td>
        </tr>
        <tr>
            <td>
                <input type="checkbox" name="day1" <c:if test="${day1 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="day2" <c:if test="${day2 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="day3" <c:if test="${day3 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="day4" <c:if test="${day4 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="day5" <c:if test="${day5 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="day6" <c:if test="${day6 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="day7" <c:if test="${day7 == 'true'}" >checked</c:if>>
            </td>
        </tr>
    </table>
    <input type="submit" value="修改">
</form>
<form action="${pageContext.request.contextPath}/staff/alterTime/${personalData.id}" method="post">
    <table>
        <tr>
            <td>8:00-10:00</td><td>10:00-12:00</td><td>12:00-14:00</td><td>14:00-16:00</td><td>16:00-18:00</td><td>18:00-20:00</td>
        </tr>
        <tr>
            <td>
                <input type="checkbox" name="time1" <c:if test="${time1 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="time2" <c:if test="${time2 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="time3" <c:if test="${time3 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="time4" <c:if test="${time4 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="time5" <c:if test="${time5 == 'true'}" >checked</c:if>>
            </td>
            <td>
                <input type="checkbox" name="time6" <c:if test="${time6 == 'true'}" >checked</c:if>>
            </td>
        </tr>
    </table>
    <input type="submit" value="修改">
</form>
</body>
</html>
