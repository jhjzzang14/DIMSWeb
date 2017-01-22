<%@page import="org.springframework.web.context.annotation.RequestScope"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${userVo.userTypeAs eq 'A'}">
			학번 ${userVo.userId} <br />
			이름 ${userVo.userName} <br />
			관리자등급
		</c:when>
		<c:otherwise>
			<c:if test="${userVo.userAuthYn eq 'N'}">
				<label>인증번호</label>
				<input type="text" name="userAuthKey" class="form-control" />
			</c:if>
			<c:if test="${userVo.userAuthYn eq 'Y'}">
				학번 ${userVo.userId} <br />
				이름 ${userVo.userName} <br />
				학과 ${userVo.dptName} <br />
			</c:if>
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