<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<header>
	<div id="header" class="header_info"></div>
	<div class="main-a">
		<c:if test="${not sessionScope.isLogin }">
			<a href="userJoinForm">회원가입</a>
			<a href="userLoginForm">로그인</a>
		</c:if>
		<c:if test="${sessionScope.isLogin }">
			<a href="userLogoutProcess">로그아웃</a>
			<a href="#">정보수정</a>
		</c:if>
	</div>
	<div class="btn-wrap">
		<div class="wrap">
			<div>
				<a href="#">주문</a>
			</div>
		</div>
		<div class="wrap">
			<div>
				<a href="#">배달</a>
			</div>
		</div>
		<div class="wrap">
			<div>
				<a href="#">포장</a>
			</div>
		</div>
	</div>
</header>