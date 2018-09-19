<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
           prefix="springForm"%>
<html>
<head>
    <title>User Save Page</title>
</head>
<body>


<springForm:form method="POST" commandName="user"
                 action="save.do">
    <table>
        <tr>
            <td>User 1  Email:</td>
            <td><springForm:input path="email" /></td>
            <td><springForm:errors path="email" cssClass="error" /></td>
        </tr>
        <tr>
            <td>User 1 Password:</td>
            <td><springForm:input path="password" /></td>
            <td><springForm:errors path="password" cssClass="error" /></td>
        </tr>

    </table>


</springForm:form>



</body>
</html>
