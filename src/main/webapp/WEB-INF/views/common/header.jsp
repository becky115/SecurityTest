 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
	function logout(){
		document.getElementById("logoutForm").submit();
	}
</script>
 <div id="header">
	<div style="border-bottom:1px solid #b4b4b4; margin-bottom:20px; padding:20px 10px;">
		<c:if test="${principal.username }">
			<strong>Welcome, <sec:authentication property="principal.username"/></strong>
		</c:if>
		<c:if test="${!principal.username }">
		<strong>Welcome, <sec:authentication property="name"/></strong>
		</c:if>
		<c:url value="/logout" var="logoutUrl"/>
		<ul>
			<li><a href="<c:url value='/admin/test.do'/>">adminPage</a></li>
			<li><a href="javascript:logout()">LogOut</a></li>
		</ul>
		
		<form action="${logoutUrl}" method="post" id="logoutForm">
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
	</div>
 </div>
