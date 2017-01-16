<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title> ▒ DIMS Web JavaHolic co.ltd,. ▒ </title>
		
		<script src="<c:url value="/assets/js/jquery-2.1.1.min.js"/>"></script>
		<link href="<c:url value="/assets/css/login/login.css"/>" rel="stylesheet">
		<link href="<c:url value="/assets/css/bootstrap.min.css"/>" rel="stylesheet">
		<link href='<c:url value="/assets/css/bootstrap-drawer.min.css"/>' rel="stylesheet">
		
<script>

	
	$(document).on('click','.submit',function(){
		
		alert("ddd");
		alert($('#inputId').val());
		alert($('#inputPassword').val());
		

		
		
		$.ajax({
			url : '/logincheck' ,
			type : 'post', 
			dataTyp : 'json',
			data : $('.form-signin').serialize() ,
			success : function(data){
				
				console.dir(data);
				
			}
		})
	});
	
	


</script>
		
		
</head>
<body>
<div class="container">
		<!-- <div class="card-header text-center">
	  		Login
		</div> -->
		
		<div class="card card-container">
			<!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
			<img id="profile-img" class="profile-img-card" src="<c:url value="img/logo.png"/>" style=" width: 200px;"/>
			<p id="profile-name" class="profile-name-card"></p>
			<form class="form-signin"  method="post">
				<span id="reauth-email" class="reauth-email"></span>
				<input type="text" id="inputId" name="userId" class="form-control" placeholder="학번을 입력하여주세요." required autofocus>
				<input type="password" id="inputPassword" name ="userPassword"class="form-control" placeholder="비밀번호를 입력하여주세요." required>
				<div id="remember" class="checkbox">
					<label>
						<input type="checkbox" value="remember-me"> Remember me
					</label>
				</div>
				<button class="btn btn-lg btn-primary btn-block btn-signin submit" type="button">Sign in</button>
				<button class="btn btn-lg btn-primary btn-block btn-signin" type="button">Password Find</button>
			</form><!-- /form -->
			<a href="#" class="forgot-password">
				Forgot the password?
			</a>
		</div><!-- /card-container -->
</div><!-- /container -->
</body>
</html>