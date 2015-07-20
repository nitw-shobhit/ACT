<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
<html data-ng-app="act-app">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>ACT</title>
	<link rel="stylesheet" href="<%= request.getContextPath()%>/resources/css/bootstrap.css">
	<link rel="stylesheet" href="<%= request.getContextPath()%>/resources/css/ngDialog.css">
	<link rel="stylesheet" href="<%= request.getContextPath()%>/resources/css/ngDialog-theme-default.css">
	<link rel="stylesheet" href="<%= request.getContextPath()%>/resources/css/ui.fancytree.css" >
	<link rel="stylesheet" href="<%= request.getContextPath()%>/resources/css/act.css">
	<script src="<%= request.getContextPath()%>/resources/js/jquery-1.11.1.min.js"></script>
	<script src="<%= request.getContextPath()%>/resources/js/bootstrap.js"></script>
	<script src="<%= request.getContextPath()%>/resources/js/angular.min.js"></script>
	<script src="<%= request.getContextPath()%>/resources/js/angular-route.min.js"></script>
	<script src="<%= request.getContextPath()%>/resources/js/angular-ui-router.js"></script>
	<script src="<%= request.getContextPath()%>/resources/js/angular-translate.js"></script>
	<script src="<%= request.getContextPath()%>/resources/js/actAngular.js"></script>
	<script src="<%= request.getContextPath()%>/resources/js/ngDialog.js"></script>
	<script src="<%= request.getContextPath()%>/resources/js/jquery-ui.custom.js"></script>
	<script src="<%= request.getContextPath()%>/resources/js/jquery.fancytree.js"></script>
	<script src="<%= request.getContextPath()%>/resources/js/act.js"></script>
    <script src="<%= request.getContextPath()%>/resources/js/ui-bootstrap-tpls-0.13.0.js"></script>	
    <script src="<%= request.getContextPath()%>/resources/js/angular-table.js"></script>
	<link rel="icon" type="image/x-icon" href="<%= request.getContextPath()%>/resources/images/favicon.ico" />
</head>
<body>
	<div class="baseBody">
		<div class="logoBox">
			<div class="logo">
			</div>
			<div class="userInfo" data-ng-controller="userInfoController">
				<%@include file="dashboard/userInfo.jsp" %>
			</div>
		</div>
		<div class="menuBox" data-ui-view="menu"></div>
		<div class="contentBox">
			<div data-ui-view="content" class="content">
				
			</div>
		</div>
	</div>
</body>
</html>