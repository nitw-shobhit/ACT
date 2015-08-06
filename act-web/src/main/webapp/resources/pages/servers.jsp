<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ACT</title>
</head>
<body>
	<fieldset>
		<legend>	
			<span class="header">Servers</span>
		</legend>
		<div class="serverBoxScrollDiv">
			<table>
				<tr>
					<td data-ng-repeat="server in serverList">
						<div class="serverFolder">
							<div class="serverFolderContent">
								<span data-ng-show="server.serverStatus == 'Stopped'" class="serverStatusFlag"><img src="../resources/images/r-flag.png" height="16" width="16"></img></span>
								<span data-ng-show="server.serverStatus == 'Running'" class="serverStatusFlag"><img src="../resources/images/g-flag.png" height="16" width="16"></img></span>
								<br><br>
								<font size="3">{{server.serverName}}</font><br>
								<b>{{server.serverType}}-{{server.serverVersion}}</b><br>
								<div class="serverDescription"><font size="1">{{server.serverDescription}}</font></div>
							</div>
							<div class="serverSideMenu">
								<a data-ng-click=""
									class="serverSideMenuLink"><span class="flaticon-arrow16"></span></a><br>
								<a data-ng-click=""
									class="serverSideMenuLink"><span class="flaticon-power10"></span></a><br>
								<a data-ng-click=""
									class="serverSideMenuLink"><span class="flaticon-tools6"></span></a><br>
								<a data-ng-click=""
									class="serverSideMenuLink"><span class="flaticon-shape51"></span></a><br>
								<a data-ng-click=""
									class="serverSideMenuLink"><span class="flaticon-file94"></span></a><br>
								<a data-ng-click=""
									class="serverSideMenuLink"><span class="flaticon-delete97"></span></a>
							</div>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</fieldset>
</body>
</html>