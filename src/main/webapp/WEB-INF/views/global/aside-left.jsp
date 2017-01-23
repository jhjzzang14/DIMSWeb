<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<aside id="sidebar">
	<div class="sidebar-inner">
		<div class="si-inner">
			<div class="profile-menu">
				<a href="">
					<div class="profile-pic">
						<img src="<c:url value="/assets/img/profile-pics/1.jpg"/>" alt="">
					</div>

					<div class="profile-info">
						Malinda Hollaway <i class="md md-arrow-drop-down"></i>
					</div>
				</a>

				<ul class="main-menu">
					<li><a href="profile-about.html"><i class="md md-person"></i>내정보</a>
					</li>
					<li><a href=""><i class="md md-history"></i> 로그아웃</a></li>
				</ul>
			</div>

			<ul class="main-menu">
				<li class="active">
					<a href="home"><i class="md md-home"> </i> Home</a>
				</li>
				<c:choose>
					<c:when test="${sessionScope.userVo.userTypeAs eq 'S'}">
						<li class="sub-menu"><a href=""><i class="md md-email"></i>메세지</a>
							<ul>
								<li><a href="widgets.html">메세지쓰기</a></li>
								<li><a class="active" href="widget-templates.html">받은메세지함</a></li>
								<li><a href="widgets.html">보낸메세지함</a></li>
								
							</ul>
						</li>
						<li class="sub-menu"><a href=""><i class="md md-keyboard-alt"></i>상벌점</a>
							<ul>
								<li><a href="tables.html">상벌점조회</a></li>
							</ul>
						</li>
						<li class="sub-menu"><a href=""><i class="md md-hotel"></i>외박</a>
							<ul>
								<li><a href="form-elements.html">외박신청</a></li>
								<li><a href="form-components.html">외박조회</a></li>
							</ul>
						</li>
						<li class="sub-menu"><a href=""><i class="md md-web"></i>게시판</a>
							<ul>
								<li><a href="form-elements.html">공지사항</a></li>
								<li><a href="form-components.html">건의사항</a></li>
								<li><a href="form-components.html">자유게시판</a></li>
							</ul>
						</li>
						<li class="sub-menu"><a href=""><i class="md md-videocam"></i>시청각교육</a>
							<ul>
								<li><a href="form-elements.html">교육조회</a></li>
								<li><a href="form-components.html">교육수강함</a></li>
							</ul>
						</li>
						<li><a href="calendar.html"><i class="md md-today"></i>일정조회</a></li>
					</c:when>
					<c:otherwise>
						<li class="sub-menu"><a href=""><i class="md md-email"></i>메세지</a>
							<ul>
								<li><a href="widgets.html">메세지쓰기</a></li>
								<li><a class="active" href="widget-templates.html">받은메세지함</a></li>
								<li><a href="widgets.html">보낸메세지함</a></li>
								
							</ul>
						</li>
						<li class="sub-menu"><a href=""><i class="md md-keyboard-alt"></i>상벌점</a>
							<ul>
								<li><a href="tables.html">상벌점부여</a></li>
								<li><a href="tables.html">상벌점조회</a></li>
							</ul>
						</li>
						<li class="sub-menu"><a href=""><i class="md md-hotel"></i>외박</a>
							<ul>
								<li><a href="form-elements.html">외박목록</a></li>
							</ul>
						</li>
						<li class="sub-menu"><a href=""><i class="md md-web"></i>게시판</a>
							<ul>
								<li><a href="form-components.html">게시판등록</a></li>
								<li><a href="form-elements.html">공지사항</a></li>
								<li><a href="form-components.html">건의사항</a></li>
								<li><a href="form-components.html">자유게시판</a></li>
							</ul>
						</li>
						<li class="sub-menu"><a href=""><i class="md md-videocam"></i>시청각교육</a>
							<ul>
								<li><a href="form-elements.html">교육등록</a></li>
								<li><a href="form-elements.html">교육조회</a></li>
							</ul>
						</li>
						<li class="sub-menu"><a href=""><i class="md md-today"></i>일정</a>
							<ul>
								<li><a href="form-elements.html">일정등록</a></li>
								<li><a href="form-components.html">일정조회</a></li>
							</ul>
						</li>
					</c:otherwise>
				</c:choose>
<!-- 				<li class="sub-menu"><a href=""><i class="md md-swap-calls"></i>User
						Interface</a>
					<ul>
						<li><a href="colors.html">Colors</a></li>
						<li><a href="animations.html">Animations</a></li>
						<li><a href="box-shadow.html">Box Shadow</a></li>
						<li><a href="buttons.html">Buttons</a></li>
						<li><a href="icons.html">Icons</a></li>
						<li><a href="alerts.html">Alerts</a></li>
						<li><a href="notification-dialog.html">Notifications &
								Dialogs</a></li>
						<li><a href="media.html">Media</a></li>
						<li><a href="components.html">Components</a></li>
						<li><a href="other-components.html">Others</a></li>
					</ul></li>
				<li class="sub-menu"><a href=""><i
						class="md md-trending-up"></i>Charts</a>
					<ul>
						<li><a href="flot-charts.html">Flot Charts</a></li>
						<li><a href="other-charts.html">Other Charts</a></li>
					</ul></li>
				<li><a href="generic-classes.html"><i class="md md-layers"></i>
						Generic Classes</a></li>
				<li class="sub-menu"><a href=""><i
						class="md md-content-copy"></i> Sample Pages</a>
					<ul>
						<li><a href="profile-about.html">Profile</a></li>
						<li><a href="list-view.html">List View</a></li>
						<li><a href="messages.html">Messages</a></li>
						<li><a href="login.html">Login and Sign Up</a></li>
						<li><a href="404.html">Error 404</a></li>
					</ul></li> -->
			</ul>
		</div>
	</div>
</aside>