<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<div class="header">
		<div class="back header1"><img src="resources/img/icon/back.png"></div>
	</div>
	
	<form action="companyLoginProcess">
		<input id="id" class="id" placeholder="아이디 또는 이메일" name="comId"  />
		<input id="pass" class="pass" placeholder="비밀번호" name="comPass" />
		<input type="submit" value="로그인">	
	</form>
	
	<a href="userLoginForm">회원로그인</a>
	
</article>