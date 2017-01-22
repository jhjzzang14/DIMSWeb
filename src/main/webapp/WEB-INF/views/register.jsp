<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="<c:url value="/assets/css/bootstrap.min.css"/>" rel="stylesheet">
		<link href='<c:url value="/assets/css/bootstrap-drawer.min.css"/>' rel="stylesheet">
		<link href="<c:url value="/assets/css/app.min.1.css"/>" rel="stylesheet">
        <link href="<c:url value="/assets/css/app.min.2.css"/>" rel="stylesheet">
		<link href="<c:url value="/assets/vendors/animate-css/animate.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/assets/vendors/sweetalert2/sweetalert2.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/assets/vendors/material-icons/material-design-iconic-font.less"/>" rel="stylesheet/less">
		<script src="<c:url value="/assets/js/less.min.js"/>"></script>
		<title>회원가입</title>
	</head>
<body class="login-content">
	<div class="lc-block toggled" id="l-register">
	<form id="regist-form">
		<div class="input-group m-b-20">
	    	<span class="input-group-addon"><i class="md md-person"></i></span>
	    	<div class="fg-line">
	    		<input type="text" name="userId" class="form-control" placeholder="학번 입력" required autofocus>
	    	</div>
	    </div>
	        
        <div class="input-group m-b-20">
            <span class="input-group-addon"><i class="md md-mail"></i></span>
            <div class="fg-line">
                <input type="text" name="userEmail" class="form-control" placeholder="Email 정확하게 입력" required>
            </div>
        </div>
	        
        <div class="input-group m-b-20">
            <span class="input-group-addon"><i class="md md-accessibility"></i></span>
            <div class="fg-line">
                <input type="password" name="userPassword" class="form-control" placeholder="비밀번호 입력">
            </div>
        </div>
	        
        <div class="clearfix"></div>
        
        <div class="clearfix">
        	
        	<div class="checkbox pull-left">
	            <label>
	                <input type="checkbox" id="agree">
	                <i class="input-helper"></i>
	                JavaHolic약관에 동의합니다
	            </label>
	        </div>
        	<div class="pull-right">
        		<button type="button" class="btn btn-danger"><i class="md md-arrow-back"></i></button>
        		<button type="button" class="btn btn-primary doRegist"><i class="md md-arrow-forward"></i></button>
        	</div>
        </div>
	    </form>    
        <!-- <a href="" class="btn btn-login btn-danger btn-float"><i class="md md-arrow-forward"></i></a> -->
    </div>
	
        
	<script src="<c:url value="/assets/js/jquery-2.1.1.min.js"/>"></script>
	<script src="<c:url value="/assets/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/assets/js/functions.js"/>"></script>
	<script src="<c:url value="/assets/vendors/waves/waves.min.js"/>"></script>
	<script src="<c:url value="/assets/vendors/sweetalert2/sweetalert2.min.js"/>"></script>
	<script src="<c:url value="/javascripts/user/regist.js"/>"></script>
</body>
</html>