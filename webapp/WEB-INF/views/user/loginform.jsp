<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 페이지</title>
</head>
<body>

	<div id="containder">
		<c:import url="/WEB-INF/views/include/header.jsp"></c:import>
			<form id="login-form" name="loginform" method="post"
				action="${pageContext.request.contextPath }/user/login">
				
			<label class="block-label" for="email">이메일</label>
			<input id="email" name="email" type="text" value="">
			
			<label class="block-label" for="password">비밀번호</label>
			<input id="paasword" name="password" type="password" value="">
			
			<c:if test="${param.result=='fail' }">
				<p>로그인 실패</p>
			</c:if>
				
				<input type="submit" value ="로그인">			
			</form>
			
		<c:import url="/WEB-INF/views/include/navigation.jsp"/>
		<c:import url="/WEB-INF/views/include/footer.jsp"/>
	</div>
	
</body>
</html>