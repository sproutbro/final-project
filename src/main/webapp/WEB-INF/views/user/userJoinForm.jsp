<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<div class="header">
		<div class="back header1"><img src="resources/img/icon/back.png"></div>
		<div class="main_address header2" >회원가입</div>
		<div class="header3" >&nbsp;</div>
	</div>
	
	<h1>어서오세요<br>약관동의가 필요해요</h1>
	
	<form action="userJoinProcess" method="POST">
		아이디 : <input type="text"id="user_id" name="user_id" placeholder="아이디를 입력해주세요." data-idCheck="0">
			<input type="button" value="중복확인" id="userIdOverlap"/><br/>
			<span id="user_id_ok">사용 가능한 아이디 입니다.</span>
			<span id="user_id_already">누군가 사용중인 아이디 입니다.</span>
		비번 : <input type="text" id="user_pass" name="user_pass" placeholder="비밀번호를 입력해주세요."><br/>
		이름 : <input type="text" name="user_name"><br/>
		이메일 : <input type="text" name="user_email"><br/>
		닉네임 : <input type="text" name="user_nick"><br/>
		<!-- 등급 : <input type="text" name="user_grade"><br/> -->
		
		성인확인 : 
		<p>어쩌구 저쩌구</p>
		성인임<input type="radio" name="user_isadult" value="1">
		성인아님<input type="radio" name="user_isadult" value="2"><br/>
		
		약관동의 : 
		<p>어쩌구 저쩌구</p>
		약관동의<input type="radio" name="user_isclause" value="1">
		동의안함<input type="radio" name="user_isclause" value="2"><br/>
		
		휴대전화 : <input type="text" name="user_phone"><br/>
		<!-- 포인드 : <input type="text" name="user_point"><br/> -->
		<input type="submit" id="join" name="join" value="가입하기">
	</form>
	
</article>