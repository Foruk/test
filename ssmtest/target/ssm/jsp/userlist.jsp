<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" %>
<taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" />
<html>
<head>
    <title>SSM test</title>
</head>
<br>
<table>
    <c:forEach items="${userlist}" var="user">
        <tr>
            <td>用户ID:</td>
            <td><c:out value="${user.userId}"/></td>
            <td>用户名:</td>
            <td><c:out value="${user.userName}"/></td>
            <td>用户密码:</td>
            <td><c:out value="${user.password}"/></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
