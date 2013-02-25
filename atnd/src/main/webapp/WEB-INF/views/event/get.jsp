<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" session="false"%>

<form name="thisForm" method="GET">
	<table>
		<tr>
			<th bgcolor="#FFFFA4" width="150px">イベント名</th>
			<td><input type="text" name="eventName" value="${dto.eventName}" style="width:420px"/></td>
		</tr>
		<tr>
			<th bgcolor="#FFFFA4" width="150px">定員数</th>
			<td><input type="text" name="limit" value="${dto.limit}" style="width:420px"/></td>
		</tr>
		<tr>
			<th bgcolor="#FFFFA4" width="150px">概要</th>
			<td><textarea name="overview" rows="7" style="width:420px">${dto.overview}</textarea></td>
		</tr>
	</table>

	<br> <input type="submit" value="戻る"
		onclick="document.thisForm.action = '/atnd/event'" /> <input
		type="submit" value="更新" onclick="document.thisForm.action = 'update'" />
	<input type="submit" value="削除"
		onclick="document.thisForm.action = 'delete'" />
</form>
