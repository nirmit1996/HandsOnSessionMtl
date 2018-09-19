<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page session="false" %>
<html>
<head>
    <title>User Saved Successfully</title>
</head>
<body>
<h3>
    User Saved Successfully.
</h3>

<strong>Customer Email:${user.email}</strong><br>
<%--<strong>Customer Password:${customer.password}</strong><br>--%>

</body>
</html>
