<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<tr>
		<th>AccNo</th>
		<th>EmailId</th>
		<th>Amount</th>
	</tr>
	<core:forEach var="account" items="${sessionScope.accounts}">
		<tr>
		<td><core:out value="${account.getAccno()}"></core:out> </td>
		<td><core:out value="${account.getEmailid()}"></core:out> </td>
		<td><core:out value="${account.getAmount()}"></core:out> </td>
		</tr>
	</core:forEach>
</table>
</body>
</html>