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
			<span class="header">WEB SERVERS</span>
		</legend>
		<div class="serverBoxScrollDiv">
			<table>
				<tr>
					<td data-ng-repeat="webServer in webServerList">
						<div class="serverFolder">
							<div class="serverFolderContent">
								<br>
								<font size="3">{{webServer.serverName}}</font><br>
								<b>{{webServer.serverType}}-{{webServer.serverVersion}}</b><br>
								<div class="serverDescription">{{webServer.serverDescription}}</div>
							</div>
							<div data-ng-class="webServer.serverStatus == 'Stopped' ? 'serverSideMenu inactiveBg' : 'serverSideMenu activeBg'">
								<a data-ng-click="startWebServer(webServer)"
									class="serverSideMenuLink"><span class="flaticon-arrow16"></span></a><br>
								<a data-ng-click="stopWebServer()"
									class="serverSideMenuLink"><span class="flaticon-power10"></span></a><br>
								<a data-ng-click="configureWebServer()"
									class="serverSideMenuLink"><span class="flaticon-tools6"></span></a><br>
								<a data-ng-click="trackChangesWebServer()"
									class="serverSideMenuLink"><span class="flaticon-shape51"></span></a><br>
								<a data-ng-click="logsWebServer()"
									class="serverSideMenuLink"><span class="flaticon-file94"></span></a><br>
								<a data-ng-click="deleteWebServer()"
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