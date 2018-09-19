<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Login Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
.errorMsgClass{
    color:red;
    font-style: italic;
    font-weight: bold;f
    ont-size:16px
}
</style>
</head>
<body>

	<springForm:form method="POST" commandName="user"
		action="login">
		<table>
			<tr>
				<td>Email:</td>
				<td><springForm:input path="email" type="email"/></td>
				<td><springForm:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><springForm:input path="password" type="password"/></td>
				<td><springForm:errors path="password" cssClass="error" /></td>
			</tr>
		</table>
        <tr>
        <br>
            <td colspan="3"><input type="submit" value="Login User"></td>
        </tr>
	</springForm:form>

      <c:if test="${errorMsg && not empty errorMsg}">
        <br>
          <span class="errorMsgClass">${errorMsg}</span>
      </c:if>

</body>
</html>