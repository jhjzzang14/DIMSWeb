<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title><decorator:title default="▒ DIMS Web JavaHolic co.ltd,. ▒ "/></title>
		<decorator:head/>
	</head>
	<body>
		<page:applyDecorator page="/WEB-INF/views/global/header.jsp" name="header"/>
		
		<decorator:body/>
		
		<page:applyDecorator page="/WEB-INF/views/global/footer.jsp" name="footer"/>		
	</body>
</html>