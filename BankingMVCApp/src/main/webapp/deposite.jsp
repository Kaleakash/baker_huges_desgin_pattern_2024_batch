<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Deposit the amount</h2>
<form action="AccountDepositeController" method="post">
<label>EmailId</label>
<input type="email" name="emailid" value="${sessionScope.name}" readonly="readonly"/><br/>
<label>Amount</label>
<input type="number" name="amount"/><br/>
<input type="submit" value="Deposit"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="customerhome.jsp">Back</a>
</body>
</html>