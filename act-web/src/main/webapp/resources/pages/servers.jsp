<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ACT</title>
</head>
<body>
	<fieldset class="serverBox">
		<legend>
			<span class="header">Servers</span>
		</legend>
		<fieldset>
			<table class="table table-striped serverTable" at-table at-paginated at-list="serverList" at-config="config">
				<thead></thead>
				<tbody>
					<tr>
						<td at-implicit at-sortable at-attribute="serverName" at-initial-sorting="asc" at-title="NAME" ></td>
						<td at-implicit at-sortable at-attribute="serverHost" at-title="HOST" ></td>
						<td at-implicit at-sortable at-attribute="serverLocation" at-title="LOCATION" ></td>
						<td at-implicit at-sortable at-attribute="serverStatus" at-title="STATUS" ></td>
						<td at-title="ACTIONS">
							<a data-ng-click="startServer(item)"><span class="flaticon-arrow16"></span></a>
							<span class="flaticon-power10"></span>
							<span class="flaticon-tools6"></span>
							<span class="flaticon-shape51"></span>
							<span class="flaticon-file94"></span>
							<span class="flaticon-delete97"></span>
						</td>
					</tr>
				</tbody>
			</table>
			<at-pagination at-list="serverList" at-config="config"></at-pagination>
		</fieldset>
	</fieldset>
</body>
</html>