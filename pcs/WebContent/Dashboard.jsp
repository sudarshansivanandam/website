<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="jobsite.LoginServlet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>user</title>
</head>
<body>
<h2>Dashboard</h2>
<%
LoginServlet lb = new LoginServlet();
%>
<h2>Hello <%= lb.User %></h2>
<h1 class="inactive underlineHover">
						<a href="user.jsp">Update Your Profile</a>
					</h1>
</body>
</html>