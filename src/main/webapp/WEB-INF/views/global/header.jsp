<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href='<c:url value="/assets/css/header/header.css"/>' rel="stylesheet">
<div class="navigation">
	<div class="pull-left" style="padding-top : 19px;">
		<ul>
			<li><a href="#main-menu" data-toggle="drawer" aria-foldedopen="false" aria-controls="main-menu"><span class="glyphicon glyphicon-menu-hamburger clickable main-menu"></span></a></li>
			<li><a href="#" class="nav-title"><b>기숙사 정보관리 시스템</b></a></li>
		</ul>
	</div>
	<div class="pull-right clearfix" style="padding-top: 7px;">
		<div class="pull-left" style="margin-right: 10px;">
			<img src="a" alt="프사영역" style="width: 64px; height: 64px;">
		</div>
		<div class="pull-left" style="padding-top: 7px;">
			<span style="font-size: 20px;"><strong>ㅁㅁㅁ</strong></span>님 <span class="badge" style="background-color: #b94a48;">5</span>
		</div>
	</div>	
</div>

<div id="main-menu" class="drawer dw-xs-10 dw-sm-6 dw-md-4 fold" aria-labelledby="main-menu">
    <div class="drawer-contents">
        <div class="drawer-heading" style="background-color: #2196F3;">
           	<div style="padding-left: 10px;">
           		<h2><a style="color:white;" href="#main-menu" data-toggle="drawer" aria-foldedopen="false" aria-controls="main-menu"><span class="glyphicon glyphicon-menu-hamburger clickable"></span></a><span style="font-size: 30px; margin-left: 10px;">
	           	<a href="#" style="color:white;"><b>기숙사 정보관리 시스템</b></a></span></h2>
           	</div>
           	<div style="padding-left:10px; padding-bottom:10px; margin-top: 15px;">

           	</div>
        </div>
        <div class="drawer-body">
			바디바디
        </div>
        <ul class="drawer-nav">
            <li role="presentation" class="active"><a href="${contextPath}/${sessionScope.user.id}">컨텐츠</a></li>
            <li role="presentation"><a href="#">컨텐츠2</a></li>
            <li role="presentation"><a href="#">컨텐츠3</a></li>
        </ul>
        <div class="drawer-footer">
            <small>&copy;Hyungyu, LEE</small>
        </div>
    </div>
</div>
<div class="container">
    <!-- content as per usual -->
</div>
