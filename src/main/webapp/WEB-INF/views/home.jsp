<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<Title>Diet Manager</Title>
<head>
<style>
body {
	margin: 0;
	padding: 0;
}
</style>
<%@ include file="/WEB-INF/views/include/include-main.jspf"%>
</head>

<body>


	<c:choose>
		<c:when test="${BODY == 'NOTICE'}">
			<%@ include file="/WEB-INF/views/body/notice.jspf"%>
		</c:when>
		<c:when test="${BODY == 'WRITE'}">
			<%@ include file="/WEB-INF/views/body/write.jspf"%>
		</c:when>
		<c:when test="${BODY == 'VIEW'}">
			<%@ include file="/WEB-INF/views/body/board_view.jspf"%>
		</c:when>
		<c:when test="${BODY == 'ACOMMENT'}">
			<%@ include file="/WEB-INF/views/body/acomment.jspf"%>
		</c:when>
		<c:when test="${BODY == 'AC_WRITE'}">
			<%@ include file="/WEB-INF/views/body/ac_write.jspf"%>
		</c:when>
		<c:when test="${BODY == 'AC_VIEW'}">
			<%@ include file="/WEB-INF/views/body/ac_view.jspf"%>
		</c:when>
		<c:when test="${BODY == 'TIP'}">
			<%@ include file="/WEB-INF/views/body/tip.jspf"%>
		</c:when>
		<c:when test="${BODY == 'TIP_WRITE'}">
			<%@ include file="/WEB-INF/views/body/tip_write.jspf"%>
		</c:when>
		<c:when test="${BODY == 'TIP_VIEW'}">
			<%@ include file="/WEB-INF/views/body/tip_view.jspf"%>
		</c:when>
		<c:when test="${BODY == 'CONTROLLMENU'}">
			<%@ include file="/WEB-INF/views/body/controllmenu.jspf"%>
		</c:when>
		<c:when test="${BODY == 'USERVIEW'}">
			<%@ include file="/WEB-INF/views/body/user_view.jspf"%>
		</c:when>
		<c:otherwise>
			<div class="mainImg">
				<img src="${rootPath}/resources/front.jpg">
			</div>
		</c:otherwise>

	</c:choose>

</body>
</html>