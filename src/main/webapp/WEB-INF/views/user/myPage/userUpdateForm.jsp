<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<article>
	<div class="header">
		<div class="back header1"><img src="resources/img/icon/back.png"></div>
		<div class="main_address header2" >정보수정</div>
		<div class="header3" >&nbsp;</div>
	</div>
	<form id="updateForm" action="updateProcess"
		method="post">
		<div>
			<input type="text" id="user_id" name="user_id" value="${ sessionScope.user_id }"/>
			<input type="hidden" id="rename" name="rename" value="x"/>
		</div><br/>
		이메일 : <input type="text" id="user_email" name="user_email" 
			value="${sessionScope.user_email }" readonly/><br/>
		현재 비밀번호 : <input type="text" id="user_pass" name="user_pass" /><br/>
		신규 비밀번호 : <input type="text" id="user_pass1" name="user_pass1" /><br/>
		
		
		<br/>
		<input type="button" id="update" name="update" value="수정하기" />&nbsp;
		<input type="button" id="delete" name="delete" value="식제하기" />
	</form>
</article>