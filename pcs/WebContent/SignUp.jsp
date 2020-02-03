<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
	<center>
		<h1>You Are One Step Away From Your Goals!!</h1>
	</center>
	<div class="wrapper fadeInDown">
		<div id="formContent">
			<!-- Tabs Titles -->
			<div class="imgcontainer">
				<center>
					<img src="PicsArt_12-04-11.27.55.png" height="239" />
				</center>
			</div>

			<form method="post" action="RegisterServlet">
				<h1>REGISTER HERE!!</h1>
				<input type="text" id="FN" name="N" required placeholder="Enter Name" pattern="[a-zA-Z]{1,15}"> 
				<input type="text" id="SN" name="US" required placeholder="Enter Username" pattern="^[a-z0-9_-]{3,15}$"> 
				<input type="password" id="PWD" name="PWD" required placeholder="Enter Password" required pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{6,}$" title="Password should be of minimum length of 6 and should contain at least 1 Letter and 1 Numeric Character " />
				<input type="text" id="email" name="email" required placeholder="Enter Email ID" pattern="(^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$)" title="Enter valid Email">
				<input type="text" id="PN" name="PN" required minlength="10" maxlength="10" placeholder="Enter MobileNumber">
				<input type="submit" value="Register">
				<h3>
					EMPLOYER <input type="radio" required name="e" value="employer" name="status">
					EMPLOYEE <input type="radio" required name="e" value="employee" name="status">
				</h3>
				<H3>Already A Member?</h3>
				<h1 class="inactive underlineHover">
					<a href="SignIn.jsp"> Sign In</a>
				</h1>

			</form>