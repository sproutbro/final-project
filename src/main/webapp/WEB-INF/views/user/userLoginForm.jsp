<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<div class="header">
		<div class="back header1"><img src="resources/img/icon/back.png"></div>
		<div class="main_address header2" >로그인</div>
		<div class="header3" >&nbsp;</div>
	</div>
	
	<form id="loginForm" action="userLoginProcess"
		method="post">
		<input id="user_id" class="id" placeholder="아이디 또는 이메일" name="user_id"  />
		<input id="user_pass" class="pass" placeholder="비밀번호" name="user_pass" />
		<input id="login" name="login" type="submit" value="로그인">	
	</form>
	
	<a href="companyLoginForm">사장로그인</a>
	<a href="companyInsertForm">사장 회원가입</a>
	
	<br><br><br>
	<a href="userFind?userCheck=true">아이디 찾기</a> | 
	<a href="userFind?userCheck=false">비밀번호 찾기</a>
	<br><br><br><br><br> 
	<div>페이스북 로그인</div>
	<div>네이버 로그인</div>
	<div>Apple 로그인</div>
	<br> 
	<div>혹시, 배달의민족이 처음이신가요? 
		<a href="userJoinForm">회원가입</a>
	</div>
</article>