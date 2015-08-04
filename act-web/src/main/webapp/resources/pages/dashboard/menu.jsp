<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ACT</title>
	<script type="text/javascript">
		$(document).ready(function(e) {
			$('#firstLink').addClass('menuSelect');
		});
		$(function() {
		$('td').click(
			function() {
				$(this).parents('table').find('td').each(
				function(index, element) {
					$(element).removeClass('menuSelect');
				});
				$(this).addClass('menuSelect');
			});
		});
	</script>
</head>
<body>
	<table>
		<tr>
			<td id="firstLink" class="menuBg"><a data-ng-click="home()" class="menuLink"><font class="underline">H</font>ome</a></td>
			<td class="menuBg"><a data-ng-click="server()" class="menuLink"><font class="underline">S</font>ervers</a></td>
			<td class="menuBg"><a data-ng-click="db()" class="menuLink"><font class="underline">D</font>atabases</a></td>
			<td class="menuBg"><a data-ng-click="stngs()" class="menuLink"><font class="underline">S</font>ettings</a></td>
			<td class="menuBg"><a data-ng-click="help()" class="menuLink"><font class="underline">H</font>elp</a></td>
		</tr>
	</table>
</body>
</html>