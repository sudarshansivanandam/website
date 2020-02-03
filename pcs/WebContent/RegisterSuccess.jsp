<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
	<div class="login">
		<br>
		<h1>Registered Successfully</h1>
		<br> <br>
		<center>Redirecting To Login Page..</center>
		<%
			response.setHeader("Refresh", "5;url=SignIn.jsp");
		%>
	</div>
</body>
</html>
