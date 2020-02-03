<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Failed</title>
<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
<div class="login">
<br>
<h1>Login Failed</h1>
<br>
<br>
<center>Redirection to Login Page..</center>
<%
response.setHeader("Refresh", "5;url=SignIn.jsp");
    %>
</div>
</body>
</html>
