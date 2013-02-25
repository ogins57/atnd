<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" session="false"%>

<!-- Main -->
<table>
	<tr bgcolor="#FFFFA4">
		<th width="150px">イベント名</th>
		<th width="70px">定員数</th>
		<th width="350px">概要</th>
	</tr>
	<c:forEach var="item" items="${list}">
		<tr>
			<td width="150px"><a href="/atnd/event/${item.key}/">${item.value.eventName}</a></td>
			<td width="70px">${item.value.limit}</td>
			<td width="350px">${item.value.overview}</td>
		</tr>
	</c:forEach>
</table>

<br>
<form method="GET" action="/atnd/event/create">
	<input type="submit" value="新規登録" />
</form>
