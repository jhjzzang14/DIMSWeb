<%@page import="org.springframework.web.context.annotation.RequestScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> ▒ DIMS Web JavaHolic co.ltd,. ▒ </title>
<script src="<c:url value="/assets/js/jquery-2.1.1.min.js"/>"></script>

<script>

</script>
</head>
<body>
	<c:choose>
		<c:when test="${userVo.userTypeAs eq 'A'}">
		</c:when>
		<c:otherwise>
			<div align="center">
				<div class="content" style="width: 70%;">
					<div class="page-header" align="left">
						
					</div>
					<div class="card">
						<div class="card-header">
							<h2>기숙사 입사 신청서</h2>
						</div>
						<div class="card-body card-padding">
							<div class="pull-left" style="margin-right: 20px;">
								<div>
									<img src="<c:url value="/img/noimage.jpg"/>" id="profile_preview" style="width: 160px; height: 190px;">
								</div>
								<div class="fileinput fileinput-new" data-provides="fileinput">
									<span class="btn btn-primary btn-file waves-effect waves-button waves-float" style="width: 160px;">
										<span class="fileinput-new">선택</span>
										<span class="fileinput-exists">Change</span>
											<input type="file" name="userProfile">
									</span>	
								</div>
							</div>
							<div class="pull-left" style="width: 75%;">
								<div class="row">
									<div class="col-sm-6">
										<div class="input-group">
											<span class="input-group-addon"> <i
												class="md md-person"></i>
											</span>
											<div class="fg-line">
												<input type="text" class="form-control" placeholder="이름">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="input-group">
											<span class="input-group-addon"> <i class="md md-event"></i>
											</span>
											<div class="dtp-container dropdown fg-line">
												<input type='text' class="form-control date-picker"
													data-toggle="dropdown" placeholder="생년월일">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<div class="input-group">
											<span class="input-group-addon"> <i
												class="md md-phone"></i>
											</span>
											<div class="fg-line">
												<input type="text" class="form-control" placeholder="연락처">
											</div>
										</div>
									</div>
									<div class="col-sm-6">
									<div class="input-group">
										<span class="input-group-addon"> <i
												class="md md-phone"></i>
											</span>
										<div class="fg-inline select">
											<select class="form-control">
												<option>남자</option>
												<option>여자</option>
											</select>
										</div>
									</div>
									</div>
								</div>
	
							</div>
							<div class="clearfix"></div>
						</div>
					</div>
				</div>
			</div>
		</c:otherwise>
	</c:choose>
	<script type="text/javascript">
		$(document).ready(function() {
			$(document).on('change', 'input[name="userProfile"]', function() {
				var input = this;
				if (input.files && input.files[0]) {
					var reader = new FileReader();
	
					reader.onload = function(e) {
						$('#profile_preview').attr('src', e.target.result);
						$('#profile_preview').css('width', '160px');
						$('#profile_preview').css('height', '190px');
					}
	
					reader.readAsDataURL(input.files[0]);
				}
			})
		})
	</script>
	<script type="text/javascript"
		src="<c:url value="/assets/vendors/moment/moment.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/assets/vendors/bootstrap-datetimepicker/bootstrap-datetimepicker.min.js"/>"></script>
</body>
</html>