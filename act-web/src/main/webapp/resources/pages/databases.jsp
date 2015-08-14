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
			<span class="header">DATABASE SERVERS</span>
		</legend>
		<div class="serverBoxScrollDiv">
			<table>
				<tr>
					<td data-ng-repeat="dbServer in dbServerList">
						<div class="serverFolder">
							<div class="serverFolderContent">
								<br>
								<button class="btn btnLink" data-ng-click=getMetaData()><font size="3">{{dbServer.dbName}}</font></button><br>
								<b>{{dbServer.dbType}}</b><br>
								<div class="serverDescription">{{dbServer.dbDescription}}</div>
							</div>
							<div data-ng-class="dbServer.dbStatus == 'Stopped' ? 'serverSideMenu inactiveBg' : 'serverSideMenu activeBg'">
								<a data-ng-click="startDbServer(dbServer)"
									class="serverSideMenuLink"><span class="flaticon-arrow16"></span></a><br>
								<a data-ng-click="stopDbServer(dbServer)"
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