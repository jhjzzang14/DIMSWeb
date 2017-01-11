<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><decorator:title default="▒ DIMS Web JavaHolic co.ltd,. ▒ "/></title>
		<decorator:head/>
		
		<link href="<c:url value="/assets/css/bootstrap.min.css"/>" rel="stylesheet">
		<link href='<c:url value="/assets/css/bootstrap-drawer.min.css"/>' rel="stylesheet">
	</head>
	
	
	<body class="has-drawer" style="padding-top: 90px;">
		<page:applyDecorator name="header"/>
		<div class="container">
			<decorator:body/>
		</div>
		<page:applyDecorator name="footer"/>		
	</body>
</html>