<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ACT</title>
</head>
<body>
	<fieldset class="worklistBox">
		<legend>
 			<span class="header">Servers</span>
 		</legend>
		<table class="table table-striped worklistTable" at-table at-paginated at-list="worklist" at-config="config">
 			<thead></thead>
 			<tbody>
 				<tr>
 					<td at-implicit at-sortable at-attribute="taskName" at-initial-sorting="asc" at-title="NAME" ></td>
					<td at-implicit at-sortable at-attribute="taskDescription" at-title="DESCRIPTION" ></td>
 					<td at-implicit at-sortable at-attribute="taskRequestType" at-title="REQUEST-TYPE" ></td>
					<td at-implicit at-sortable at-attribute="taskAssigned" at-title="ASSIGNED-ON"></td>
					<td at-implicit at-sortable at-attribute="taskStarted" at-title="STARTED-ON" ></td>
					<td at-implicit at-sortable at-attribute="taskStatus" at-title="STATUS" ></td>
					<td at-implicit at-sortable at-attribute="taskComments" at-title="COMMENTS" ></td>
					<td at-title="ACTIONS">
						<a data-ng-click="viewTask(item)"><span class="glyphicon glyphicon-eye-open"></span></a>
					</td>
 				</tr>
 			</tbody>
 		</table>
 		<at-pagination at-list="serverList" at-config="config"></at-pagination>
 	</fieldset>
</body>
</html>