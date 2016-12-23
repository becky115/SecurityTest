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

<c:import url="/WEB-INF/views/common/header.jsp"></c:import>
<form action="login_check.do" method="post">
	<div>userId: <input type="text" name="userId" /></div>
	<div>userPass: <input type="password" name="userPass" /></div>
	<input type="hidden"  name="${_csrf.parameterName}"  value="${_csrf.token}"/>
	<input type="submit" value="로그인"/>
</form>

</body>
</html>