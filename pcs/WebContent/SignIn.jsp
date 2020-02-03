<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>
	<center>
		<h1>WELCOME!!</h1>
	</center>
	<div class="wrapper fadeInDown">
		<div id="formContent">
			<!-- Tabs Titles -->
			<div class="imgcontainer">
				<center>
					<img src="PicsArt_12-04-11.27.55.png" height="239" />
				</center>
			</div>


			<!-- Icon -->

			<!-- Login Form -->
			<form method="post" action="LoginServlet">
				<h1>LOGIN HERE!!</h1>
				<input type="text" id="login" name="login" required="required" placeholder="Enter Login ID"> 
				<input type="password" id="password" name="password" required="required"placeholder="Enter Password"> 
				<input type="submit" value="Log In">		
				<h5>
					<input type="checkbox" unchecked="unchecked"> Remember me
				</h5>
				<h3>
					EMPLOYER <input type="radio" required name="status">
					EMPLOYEE <input type="radio" required name="status">
				</h3>
				<center>
					<h3>New To PCS?</h3>
					<h1 class="inactive underlineHover">
						<a href="SignUp.jsp">Sign Up </a>
					</h1>
				</center>
			</form>



		</div>
	</div>
</body>
</html>

