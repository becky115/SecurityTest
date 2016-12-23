<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="header">
	<div style="border-bottom:1px solid #b4b4b4; margin-bottom:20px; padding:20px 10px;">
		<c:if test="${principal.username }">
			<strong>Welcome, <sec:authentication property="principal.username"/></strong>
		</c:if>
		<c:if test="${!principal.username }">
		<strong>Welcome, <sec:authentication property="name"/></strong>
		</c:if>
		<c:url value="/log_out.do" var="logoutUrl"/>
		<ul>
			<li><a href="${logoutUrl}">LogOut</a></li>
		</ul>
	</div>
</div>
</body>
</html>