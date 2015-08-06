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
	<script>
		window.fbAsyncInit = function() {
		  FB.init({
		    appId      : '1620589131524170',
		    xfbml      : true,
		    version    : 'v2.4'
		  });
		};
	
		(function(d, s, id) {
			var js, fjs = d.getElementsByTagName(s)[0];
			if (d.getElementById(id)) return;
			js = d.createElement(s); js.id = id;
			js.src = "//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.4";
			fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));
</script>
</head>
<body>
	<div id="fb-root"></div>
	<div class="baseBody">
		<br><br><br><br><br><br><br><br><br><br><br><br>
		<div class="loginBox">
			<form:form method="POST" action="/act-web/actLogin/validateLogin.do">
				<input type= "text" placeholder="User Name" class= "loginFields loginUserNameBox" name="userId" />
				<input type= "password" placeholder="Password" class="loginFields loginPasswordBox" name="userPass" />
				<table class="loginButtons">
					<tr>
						<td>
							<button class= "btn btn-primary loginSubmit">Login</button>
						</td>
						<td>&nbsp;&nbsp;or&nbsp;&nbsp;</td>
						<td>
							<div class="fb-login-button" data-max-rows="1" data-size="large" data-auto-logout-link="false"></div>
						</td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
</body>
</html>