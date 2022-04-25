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
		아이디 : <input type="text" name="user_id"><br/>
		비번 : <input type="text" name="user_pass"><br/>
		이름 : <input type="text" name="user_name"><br/>
		이메일 : <input type="text" name="user_email"><br/>
		닉네임 : <input type="text" name="user_nickname"><br/>
		<!-- 등급 : <input type="text" name="user_grade"><br/> -->
		
		성인확인 : 
		<p>어쩌구 저쩌구</p>
		성인임<input type="radio" name="user_isadult" value="1">
		성인아님<input type="radio" name="user_isadult" value="0"><br/>
		
		약관동의 : 
		<p>어쩌구 저쩌구</p>
		약관동의<input type="radio" name="user_isclause" value="1">
		동의안함<input type="radio" name="user_isclause" value="0"><br/>
		
		휴대전화 : <input type="text" name="user_phone"><br/>
		<!-- 포인드 : <input type="text" name="user_point"><br/> -->
		<input type="submit">
	</form>
	
</article>