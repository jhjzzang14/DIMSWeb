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
				<div class=card style="width: 850px;">
					<div class="card-header">
						<h2>기숙사입사신청서</h2>
					</div>
					<div class="card-body card-padding" style="width: 850px">
						<form>
							<div class="pull-left"
								style="width: 125px; height: 150px; border: 1px solid black;">
								<img class="lv-img-sm"
									src=<c:url value="assets/img/profile-pics/4.jpg"/> alt="">
							</div>
							<div class="pull-right"
								style="width: 673px; height: 160px; border: 1px solid black;">
								<div class="form-group">
									<div class="fg-line">
										<input type="text" class="form-control input-lg"
											placeholder="이름" name="userName">
									</div>
									<br />
									<div class="fg-line">
										<input type="text" class="form-control input-lg"
											placeholder="연락처" name="userPhone">
									</div>
									<div class="fg-line">
										<input type="text" class="form-control input-lg"
											placeholder="주소" name="userAdress">
									</div>
									<div class="fg-line">
										<div class="select pull-left"
											style="width: 50%; border: 1px solid black;">
											<select class="form-control">
												<option>학년</option>
												<option>1학년</option>
												<option>2학년</option>
												<option>3학년</option>
												<option>4학년</option>
												<option>5학년</option>
											</select>
										</div>
										<div class="pull-right"
											style="width: 50%; height: 36px; padding-top: 7px; border: 1px solid black;">
											성별 <label class="radio radio-inline m-r-20"> <input
												type="radio" name="inlineRadioOptions" value="man">
												<i class="input-helper"></i> 남자
											</label> <label class="radio radio-inline m-r-20"> <input
												type="radio" name="inlineRadioOptions" value="woman">
												<i class="input-helper"></i> 여자
											</label>
										</div>
									</div>
								</div>
							</div>
							<div class="pull-left"
								style="width: 125px; border: 1px solid black;">
								<input type="button" class="btn btn-primary btn-sm m-t"
									value="사진첨부" />
							</div>
							<div style="border: 1px solid black">
								<div class="form-group">
									<div class="fg-line">
										<textarea class="form-control auto-size" placeholder="특이사항"></textarea>
									</div>
								</div>
							</div>

							<div class="pull-right">
								<input type="button" value="작성완료" />
							</div>

						</form>
					</div>
				</div>
			</div>
		</c:otherwise>
	</c:choose>
	<script type="text/javascript">
		$(document).ready(function() {
			if ('${userVo.userAuthYn}' == 'N') {
				$.growl({
					message : '이메일 인증을 완료해주세요!'
				}, {
					element : 'body',
					type : 'danger',
					offset : {
						x : 20,
						y : 85
					}
				});
			}
		})
	</script>
</body>
</html>