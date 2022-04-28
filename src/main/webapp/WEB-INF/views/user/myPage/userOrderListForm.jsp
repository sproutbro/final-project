<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   

<article>
	<div class="header">
		<div class="back header1"><img src="resources/img/icon/back.png"></div>
		<div class="main_address header2" >주문내역</div>
		<div class="header3" >&nbsp;</div>
	</div>
	
	<c:forEach var="o" items="${oList}" varStatus="status">
	<div>
		<div class="space">&nbsp;</div>
		<div class="flex1">
			<span>
			<%-- 	<fmt:formatDate value="${oList.odrRegDate }" type="both" pattern="yyyy-MM-dd [E]"/> <br/> --%>
			 - 
			 <c:if test="${o.odrStatus eq 0}"> 
			 	조리 중
			 </c:if>
			 <c:if test="${o.odrStatus eq 1}"> 
			 	배달 중 (지금 막 출발했습니다.)
			 </c:if>
			 <c:if test="${o.odrStatus eq 1}"> 
			 	배달 완료 (리뷰를 남겨주세요~^-^)
			 </c:if>
			 </span>
			<span>
				<a href="#" class="odrDetailBtn">주문상세</a>&emsp;
				<a href="#"><img class="orderList-img" src="resources/img/icon/menu.png" /></a>
			</span>
		</div>
		<a href="#">
		<div class="storeList">
			<div class="storeImg"><img src="#"></div>
			<div class="storeContent">
				<p class="storeName-min">${sList[status.index].storeName} ></p>
				<c:forEach var="p" items="${o.pList }" varStatus="status">
				<p>${p.productName }</p>
				</c:forEach>
			</div>
		</div>
		</a>
	</div>
	</c:forEach>
	
</article>
