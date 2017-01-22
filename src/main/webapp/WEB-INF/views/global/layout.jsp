<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><decorator:title default="▒ DIMS Web JavaHolic co.ltd,. ▒ "/></title>
		<decorator:head/>
		
		<link href="<c:url value="/assets/css/bootstrap.min.css"/>" rel="stylesheet">
		<link href='<c:url value="/assets/css/bootstrap-drawer.min.css"/>' rel="stylesheet">
		<link href="<c:url value="/assets/css/app.min.1.css"/>" rel="stylesheet">
        <link href="<c:url value="/assets/css/app.min.2.css"/>" rel="stylesheet">
		<script src="<c:url value="/assets/js/jquery-2.1.1.min.js"/>"></script>
		<link href="<c:url value="/assets/vendors/animate-css/animate.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/assets/vendors/sweetalert2/sweetalert2.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/assets/vendors/material-icons/material-design-iconic-font.less"/>" rel="stylesheet/less">
		<script src="<c:url value="/assets/js/less.min.js"/>"></script>
	</head>
	
	
	<body>
		<page:applyDecorator name="header"/>
		
		<page:applyDecorator name="aside-left"/>
		
		<page:applyDecorator name="aside-right"/>
		
		<div class="container">
			<decorator:body/>
		</div>
		
		<page:applyDecorator name="footer"/>		
	</body>
</html>