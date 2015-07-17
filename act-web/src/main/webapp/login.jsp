<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ACT</title>
	<link rel="icon" type="image/x-icon" href="resources/images/favicon.ico" />
	<link rel="stylesheet" href="resources/css/act.css">
	<link rel="stylesheet" href="resources/css/bootstrap.css">
</head>
<body>
	<div class="baseBody">
		<br><br><br><br><br><br><br><br><br><br><br><br>
		<div class="loginBox">
			<form:form method="POST" action="/act-web/actLogin/validateLogin.do">
				<input type= "text" placeholder="User Name" class= "loginFields loginUserNameBox" name="userId" />
				<input type= "password" placeholder="Password" class="loginFields loginPasswordBox" name="userPass" />
				<button class= "btn btn-primary loginFields loginSubmit">Login</button>
			</form:form>
		</div>
	</div>
</body>
</html>