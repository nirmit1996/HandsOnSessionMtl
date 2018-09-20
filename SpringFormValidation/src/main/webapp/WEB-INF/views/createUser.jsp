<%--
  Created by IntelliJ IDEA.
  User: Dhruv Gupta
  Date: 9/19/2018
  Time: 5:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="springForm"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Create User</title>
</head>
<body>

<springForm:form method="POST" action="saveUser" commandName="user">
    <table>
        <tr>
            <td>Email:</td>
            <td><springForm:input path="email" /></td>
            <td><springForm:errors path="email" /></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><springForm:input path="password" /></td>
            <td><springForm:errors path="password" /></td>
        </tr>
        <tr>
            <td><input type="submit" value="Create User"></td>
        </tr>
    </table>
</springForm:form>

</body>
</html>
