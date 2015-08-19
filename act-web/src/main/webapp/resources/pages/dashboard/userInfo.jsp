<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ACT</title>
<script type="text/ng-template" id="userProfile">
<fieldset>
	<legend>
		<span class="header">UPDATE PROFILE</span>
	</legend>
	<table style="margin-left: auto; margin-right: auto; width:100%;">
		<tr>
			<td style="vertical-align:top; padding: 10px;">
				<img height="80" width="80" src="<%= request.getContextPath()%>/resources/images/default_p_img.png" />
			</td>
			<td style="padding: 10px;">
				<table style="font-size: 12px;">
					<tr>
						<td style="padding: 2px;"><label>Name</label></td>
						<td style="padding: 2px;">
							<input class="form-control input-sm" type="text" data-ng-model ="ngDialogData.userName" disabled="disabled"/>
						</td>
						<td style="padding: 2px;">
						</td>
					</tr>
					<tr>
						<td style="padding: 2px;"><label>Id</label></td>
						<td style="padding: 2px;">
							<input class="form-control input-sm" type="text" data-ng-model ="ngDialogData.userId" disabled="disabled"/>
						</td>
						<td style="padding: 2px;">
						</td>
					</tr>
					<tr>
						<td style="padding: 2px;"><label>Email</label></td>
						<td style="padding: 2px;">
							<input class="form-control input-sm" type="text" data-ng-model ="ngDialogData.userEmail" />
						</td style="padding: 2px;">
						<td>
							<span class="glyphicon glyphicon-plus">
						</td>
					</tr>
					<tr>
						<td style="padding: 2px;"><label>Password</label></td>
						<td style="padding: 2px;">
							<button class="btn btn-link btn-xs" >Change Password</button>
						</td>
						<td style="padding: 2px;">
						</td>
					</tr>
					<tr>
						<td style="padding: 2px;"><label>Access Type</label></td>
						<td style="padding: 2px;">
							<input class="form-control input-sm" type="text" data-ng-model ="ngDialogData.userType" disabled="disabled"/>
						</td>
						<td style="padding: 2px;">
							<button class="btn btn-link btn-xs">Update privileges</button>
						</td>
					</tr>
					<tr>
						<td style="padding: 2px;"><label>Phone</label></td>
						<td style="padding: 2px;">
							<input class="form-control input-sm" type="text" data-ng-model ="ngDialogData.userPhone" />
						</td>
						<td style="padding: 2px;">
						</td>
					</tr>
					<tr>
						<td style="padding: 10px; float: right;">
							<button class="btn btn-primary btn-xs" data-ng-click="updateProfile()">Update</button>
						</td>
						<td style="padding: 10px;">
							<button class="btn btn-default btn-xs" data-ng-click="closeThisDialog('button')" style="float: left;">Cancel</button>
						</td>
						<td style="padding: 10px;">
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</fieldset>
</script>
</head>
<body>
	<c:choose>
		<c:when test="${UserBean.userImage == null}">
			<img class="userInfoProfilePic" src="../resources/images/default_p_img.png" />
		</c:when>
		<c:otherwise>
		</c:otherwise>
	</c:choose>
	
	<div class="btn-group" role="group" aria-label="...">
		<div class="btn-group" role="group">
		    <span class="userInfoNameSpan">${UserBean.userId}</span>
		    <a class="dropdown-toggle userInfoLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" ><img src="<%= request.getContextPath()%>/resources/images/open-link.ico" class="userInfoLinkImg" /></a>
		    <div class="dropdown-menu userInfoDropdown">
				<table class="userInfoTable">
					<tr>
						<td>
							<c:choose>
								<c:when test="${UserBean.userImage == null}">
									<img height="64" width="64" src="<%= request.getContextPath()%>/resources/images/default_p_img.png" />
								</c:when>
								<c:otherwise>
								</c:otherwise>
							</c:choose>
						</td>
						<td>
							<div class="userInfoContent">
		          				<label>Name :</label> ${UserBean.userName}<br>
		          				<label>Email :</label> ${UserBean.userEmail}<br>
		         				<label>Access Type :</label> ${UserBean.userType}<br>
		          				<label>Phone :</label> ${UserBean.userPhone}
		        			</div>
						</td>
					</tr>
					<tr>
						<td></td>
						<td>
							<button class="btn btn-default btn-xs" data-ng-click="openProfileBox('${UserBean.userId}', '${UserBean.userName}', '${UserBean.userType}', '${UserBean.userPhone}', '${UserBean.userEmail}')">View Profile</button>
							<button class="btn btn-danger btn-xs" data-ng-click="logout()">Logout</button>
						</td>
					</tr>
				</table>
		    </div>
		</div>
	</div>
</body>
</html>