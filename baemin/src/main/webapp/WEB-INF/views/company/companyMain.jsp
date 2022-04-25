<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<h1>사장님 메인화면</h1>
	
	<h3>내 가게</h3>
	<!-- storeList start -->
	<c:forEach var="s" items="${sList }">
	<a href="storeDetailForm?storeNo=${s.storeNo}">
	<div class="storeList">
		<div class="storeImg">
			<img src="${s.storeImg }">
		</div>
		<div class="storeContent">
			<div class="storeName-min">${s.storeName }</div>
			<div class="storeScope">
				<span class="scopeSpan">${s.storeScope }</span>
			</div>
			<div class="deliveryDiv">
				<span class="deliverySpan">최소주문 6000원</span>
				배달팁 
				<span class="deliverySpan">0원 ~ 4000원</span>
			</div>
			<div class="deliveryTime">
				<img src="#">
				<span> 35~40분 </span>
			</div>
		</div>
	</div>
	</a>
	
	</c:forEach>
</article>