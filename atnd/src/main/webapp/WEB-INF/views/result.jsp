<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" session="false"%>

<br>
<c:choose>
	<c:when test="${result.result}">
		<font size="5">${result.msg}</font>
	</c:when>
	<c:otherwise>
		<font size="5" color="red">${result.errMsg}</font>
	</c:otherwise>
</c:choose>

<br>
<br>
<a href="/atnd/event">戻る</a>
