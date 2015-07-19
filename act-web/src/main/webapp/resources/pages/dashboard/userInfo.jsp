<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ACT</title>
</head>
<body>
    <script type="text/ng-template" id="userInformation">
        <table style="vertical-align: top;">
			<tr>
				<td>
					<c:choose>
						<c:when test="${UserBean.userImage == null}">
							<img height="64" width="64" src="../resources/images/default_p_img.png" />
						</c:when>
						<c:otherwise>
						</c:otherwise>
					</c:choose>
				</td>
				<td>
					<div style="margin-left: 20px;">
          				<label>Name :</label> ${UserBean.userName} - ${UserBean.userId}<br>
          				<label>Email :</label> ${UserBean.userEmail}<br>
         				<label>Access Type :</label> ${UserBean.userType}<br>
          				<label>Phone :</label> ${UserBean.userPhone}
        			</div>
				</td>
			</tr>
		</table
    </script>
	<c:choose>
		<c:when test="${UserBean.userImage == null}">
			<img class="userInfoProfilePic" src="../resources/images/default_p_img.png" />
		</c:when>
		<c:otherwise>
		</c:otherwise>
	</c:choose>
	<span class="userInfoNameSpan">${UserBean.userId}</span><a href="#" popover-template="userInfoDetails.templateUrl" popover-placement="bottom" popover-trigger="mouseenter" ><img src="../resources/images/open-link.ico" class="userInfoLink" /></a>
</body>
</html>