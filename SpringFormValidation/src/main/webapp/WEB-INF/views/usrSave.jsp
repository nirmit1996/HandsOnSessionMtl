<%--
  Created by IntelliJ IDEA.
  User: ujiwal
  Date: 19/9/18
  Time: 6:11 PM
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
    <title>User Save Page</title>
    <style>
        .error {
            color: #ff0000;
            font-style: italic;
            font-weight: bold;
        }
    </style>
</head>
<body>

<%--@elvariable id="user" type="com.journaldev.spring.form.model.User"--%>
<springForm:form method="POST" commandName="user"
                 action="users.save">
    <table>
            <td>Email:</td>
            <td><springForm:input path="email" /></td>
            <td><springForm:errors path="email" cssClass="error" /></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><springForm:input path="password" /></td>
            <td><springForm:errors path="password" cssClass="error" /></td>
        </tr>
        <tr>
            <td colspan="3"><input type="submit" value="Save User"></td>
        </tr>
    </table>

</springForm:form>

</body>
</html>
