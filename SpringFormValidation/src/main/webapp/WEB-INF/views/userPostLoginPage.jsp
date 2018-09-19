<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>
<html>
<head>
	<title>User LoggedIn Successfully</title>
</head>
<body>
<h4>
	All Active Users.
</h4>

<c:forEach items="${allEmails}" var="email">
<strong>Email:${email}</strong><br><br>
</c:forEach>

</body>
</html>
