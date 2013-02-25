<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8" session="false"%>

<form method="POST" action="/atnd/event">
	<table>
		<tr>
			<th bgcolor="#FFFFA4" width="150px">カテゴリID</th>
			<td><input type="text" name="categoryId" value="1" style="width:420px"/></td>
		</tr>
		<tr>
			<th bgcolor="#FFFFA4" width="150px">イベント名</th>
			<td><input type="text" name="eventName"
				value="【ITAコミュニティ東京】 1/25 第9回例会のお知らせ" style="width:420px"/></td>
		</tr>
		<tr>
			<th bgcolor="#FFFFA4" width="150px">定員数</th>
			<td><input type="text" name="limit" value="32" style="width:420px"/></td>
		</tr>
		<tr>
			<th bgcolor="#FFFFA4" width="150px">概要</th>
			<td><textarea name="overview" rows="7" style="width:420px">
第9回例会についてお知らせします。

■日時
------------------------------------------------------
2013年01月25日（金） 17:00開始、19:00終了予定

■場所
------------------------------------------------------
ARC01-02 会議室

■内容
------------------------------------------------------
今回は、アーキテクチャレビュー会を行います。
					</textarea></td>
		</tr>
	</table>
	<br> <input type="submit" value="登録" />
</form>
