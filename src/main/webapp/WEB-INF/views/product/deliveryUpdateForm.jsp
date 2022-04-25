<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<div class="header">
		<div class="back header1"><img src="resources/img/icon/back.png"></div>
		<div class="main_address header2" >주문 지역 수정하기</div>
		<div class="header3" >&nbsp;</div>
	</div>
	
	<form id="checkForm"action="deliveryUpdateProcess">
	<input type="hidden" name="storeNo" value="${storeNo}">
	<input type="hidden" id="deliNo" name="deliNo" value="${deliNo }">
		지역 : <input type="text" name="deliArea"><br>
		가격 : <input type="text" name="deliPrice"><br>
		<button type="submit">상품 등록</button>	
		<input type="button" id="deliveryDelete" value="삭제하기">
		
	</form>
	
</article>