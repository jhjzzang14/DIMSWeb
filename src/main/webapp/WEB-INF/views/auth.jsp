<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>▒ DIMS Web JavaHolic co.ltd,. ▒</title>
<link href="<c:url value="/assets/css/bootstrap.min.css"/>"
	rel="stylesheet">
<link href='<c:url value="/assets/css/bootstrap-drawer.min.css"/>'
	rel="stylesheet">
<link href="<c:url value="/assets/css/app.min.1.css"/>" rel="stylesheet">
<link href="<c:url value="/assets/css/app.min.2.css"/>" rel="stylesheet">
<link
	href="<c:url value="/assets/vendors/animate-css/animate.min.css"/>"
	rel="stylesheet">
<link
	href="<c:url value="/assets/vendors/sweetalert2/sweetalert2.min.css"/>"
	rel="stylesheet">
<link
	href="<c:url value="/assets/vendors/material-icons/material-design-iconic-font.less"/>"
	rel="stylesheet/less">
<script src="<c:url value="/assets/js/less.min.js"/>"></script>
</head>
<body class="login-content">
	<div class="lc-block toggled" id="l-register">
		<div class="pull-left" style="margin-bottom: 10px; text-align: left">
			<h2>인증</h2>
			<small> 정상적인 서비스 이용을 위해 이메일 인증을 완료해주세요. <br /> 발신메일 : <strong>${sessionScope.userVo.userEmail}</strong>
			</small>
		</div>
		<div class="clearfix"></div>
		<form>
			<div class="input-group m-b-20">
				<span class="input-group-addon"><i class="md md-email"></i></span>
				<div class="fg-line">
					<input type="text" name="userAuthKey" class="form-control"
						placeholder="인증번호 입력" required autofocus>
				</div>
			</div>
			<div class="clearfix"></div>
			<div class="notify-fail"
				style="margin-bottom: 10px; display: none; color: red;">인증번호를
				확인해주세요</div>
			<div class="pull-right">
				<button type="button" class="btn btn-warning reAuth">인증메일
					재발송</button>
				<button type="button" class="btn btn-primary doAuth">인증</button>
			</div>
		</form>
	</div>
	<script src="<c:url value="/assets/js/jquery-2.1.1.min.js"/>"></script>
	<script src="<c:url value="/assets/js/bootstrap.min.js"/>"></script>
	<script src="<c:url value="/assets/js/functions.js"/>"></script>
	<script src="<c:url value="/assets/vendors/waves/waves.min.js"/>"></script>
	<script
		src="<c:url value="/assets/vendors/sweetalert2/sweetalert2.min.js"/>"></script>

	<script type="text/javascript">
		$(document).ready(function() {
			$(document).on('click', '.reAuth', function() {
				swal({
					title : '메일을 확인하세요.',
					text : "${sessionScope.userVo.userEmail}",
					type : 'info',
					confirmButtonColor : '#3085d6',
					confirmButtonText : '발송',
					confirmButtonClass : 'btn btn-success',
					showLoaderOnConfirm : true,
					preConfirm : function(){
						return new Promise(function(resolve, reject){
							$.ajax({
								url : '/reAuth',
								type : 'get',
								success : function(response) {
									resolve(response);
								}
							})
						});
					}
				}).then(function(response){
					if(response.code==1)
					{
						swal('','인증번호가 재발송 됐습니다.','success');
					}
					else
					{
						swal('','인증번호 발송에 실패했습니다.','error');
					}
				}, function(){
					swal('','인증번호를 발송하지 않았습니다.','info');
				})
			})
	
			$(document).on('click', '.doAuth', function() {
				$.ajax({
					url : '/auth',
					type : 'post',
					data : {
						userAuthKey : $('input[name="userAuthKey"]').val()
					},
					success : function(response) {
						if (response.code == 1) {
							swal('', '인증에 성공하셨습니다.', 'success').then(function() {
								location.href = '/home';
							});
						} else {
							$('.notify-fail').show();
						}
					}
				})
			})
		})
	</script>
</body>
</html>