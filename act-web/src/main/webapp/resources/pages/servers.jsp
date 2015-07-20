<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ACT</title>
</head>
<body>
	<fieldset class="serverBox fieldsetStyl">
		<legend class="legendStyl">
			<span class="header">Servers</span>
		</legend>
		<fieldset>
			<table class="table table-striped serverTable" at-table at-paginated at-list="serverList" at-config="config">
				<thead></thead>
				<tbody>
					<tr>
						<td at-implicit at-sortable at-attribute="serverName" at-initial-sorting="asc" at-title="NAME" ></td>
						<td at-implicit at-sortable at-attribute="serverLocation" at-title="LOCATION" ></td>
						<td at-implicit at-sortable at-attribute="serverStatus" at-title="STATUS"></td>
					</tr>
				</tbody>
			</table>
			<at-pagination at-list="serverList" at-config="config"></at-pagination>
		</fieldset>
	</fieldset>
</body>
</html>