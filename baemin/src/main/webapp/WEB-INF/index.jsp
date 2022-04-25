<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title></title>
<link rel="stylesheet" type="text/css" href="resources/css/default.css" />
<link rel="stylesheet" type="text/css" href="resources/css/index.css" />
<link rel="stylesheet" type="text/css" href="resources/css/search.css" />
<link rel="stylesheet" type="text/css" href="resources/css/store.css" />
<link rel="stylesheet" type="text/css" href="resources/css/cart.css" />
<link rel="stylesheet" type="text/css" href="resources/css/order.css" />
<script src="resources/js/jquery-3.2.1.min.js"></script>
<script src="resources/js/commond.js"></script>
<script src="resources/js/cart.js"></script>
</head>
<body>
	<c:if test="${not sessionScope.isCompany }">
		<%@ include file="template/header.jsp"%>
	</c:if>
	<c:if test="${sessionScope.isCompany }">
		<%@ include file="template/cHeader.jsp"%>
	</c:if>
	<jsp:include page="${ param.body }" />
	<%@ include file="template/footer.jsp"%>
</body>
</html>