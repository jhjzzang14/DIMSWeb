<%@page import="org.springframework.web.context.annotation.RequestScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Home</h1>
	<c:choose>
		<c:when test="${userVo.userTypeAs eq 'A'}">
			학번 ${userVo.userId} <br/>
			이름 ${userVo.userName} <br/>
			관리자등급
		</c:when>
		<c:otherwise>
			학번 ${userVo.userId} <br/>
			이름 ${userVo.userName} <br/>
			학과 ${userVo.dptName} <br/>
		</c:otherwise>
	</c:choose>
	
	<h1>화면이동</h1>
	<ul>
		<li><a href="<c:url value="/"/>">홈</a></li>
		<li><a href="<c:url value="/login"/>">로그인</a></li>
		<li><a href="<c:url value="/user/register"/>">회원가입</a></li>
	</ul>
</body>
</html>