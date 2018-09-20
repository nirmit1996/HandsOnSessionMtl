<%--
  Created by IntelliJ IDEA.
  User: Dhruv Gupta
  Date: 9/19/2018
  Time: 6:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Users</title>
</head>
<body>

<h3>List of users</h3>

<table>
    <c:forEach items="${userList}" var="entry">
        <tr>
            <td>Email: ${entry.key}</td>
            <td>Password: ${entry.value}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
