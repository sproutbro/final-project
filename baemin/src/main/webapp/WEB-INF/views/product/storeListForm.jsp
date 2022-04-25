<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<div class="header">
		<div class="back header1"><img src="resources/img/icon/back.png"></div>
		<div class="main_address header2" >양식</div>
		<div class="header3" >&nbsp;</div>
	</div>
	<div class="keywordList">
		<a href="#">배달 빠른 순</a> | 
		<a href="#">배달팁 낮은 순</a> | 
		<a href="#">기본순</a> | 
		<a href="#">주문 많은 순</a> | 
		<a href="#">별점 높은 순</a> | 
		<a href="#">가까운 순</a> | 
		<a href="#">찜 많은 순</a> | 
		<a href="#">최소주문금&nabla;</a> | 
		<a href="#">배달 빠른 순</a> | 
		<a href="#">배달 빠른 순</a> | 
		<a href="#">&nbsp; 기타</a>
	</div>
	<div>
		&nbsp;
	</div>
	
	<!-- storeList start -->
	<c:forEach var="s" items="${sList }">
	<a href="storeDetailForm?storeNo=${s.storeNo }">
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
	<!-- storeList end -->
	<jsp:include page="../../template/cartBtnForm.jsp" />
</article>