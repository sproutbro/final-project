<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<form action="storeInsert">
		<input type="hidden" name="comId" value="${sessionScope.comId}" />		
		
		회사명 : ${sessionScope.comId }<br>
		가게이름 : <input type="text" name="storeName"><br/>
		카테고리 : 
		<select name="mainCat">
			<option value="1">돈까스,회,일식</option>
			<option value="2">중식</option>
			<option value="3">치킨</option>
			<option value="4">백반,죽,국수</option>
			<option value="5">카페,디저트</option>
			<option value="6">분식</option>
			<option value="7">찜,탕,찌개</option>
			<option value="8">피자</option>
			<option value="9">양식</option>
			<option value="10">고기,구이</option>
			<option value="11">족발,보쌈</option>
			<option value="12">아시안</option>
			<option value="13">패스트푸드</option>
			<option value="14">야식</option>
			<option value="15">도시락</option>
		</select>
		
		우편번호 : 
		<input type="text" name="storeAddr1"><br/>
		주소 : 
		<input type="text" name="storeAddr2"><br/>
		상세주소 : 
		<input type="text" name="storeAddr3"><br/>
		전화번호 : 
		<input type="text" name="phone1"> - 
		<input type="text" name="phone2"> - 
		<input type="text" name="phone3"><br/>
		
		<button type="submit">입점 신청</button>
	</form>





</article>


