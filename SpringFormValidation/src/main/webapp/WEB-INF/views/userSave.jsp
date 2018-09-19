<%--
  Created by IntelliJ IDEA.
  User: rohit
  Date: 19/9/18
  Time: 6:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Save Page</title>
</head>
<body>


<springForm:form method="POST" commandName="user"
                 action="save.do">
    <table>
        <tr>
            <td>User Email:</td>
            <td><springForm:input path="email" /></td>
            <td><springForm:errors path="email" cssClass="error" /></td>
        </tr>
        <tr>
            <td>User Password:</td>
            <td><springForm:input path="password" /></td>
            <td><springForm:errors path="password" cssClass="error" /></td>
        </tr>

    </table>

</springForm:form>



</body>
</html>
