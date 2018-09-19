<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page session="false" %>
<html>
<head>
	<title>Customer Saved Successfully</title>
</head>
<body>
<h3>
	All Active Users.
</h3>

<c:forEach items="${allUsers}" var="user">
<strong>User Email:${user.email}</strong><br>
<strong>User Password: ${user.password}</strong> <br> <hr> <br>
</c:forEach>

</body>
</html>
