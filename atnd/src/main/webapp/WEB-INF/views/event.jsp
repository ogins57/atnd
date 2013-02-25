<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>
	<br>
	<br>
	<br>
	<center>
		<form method="POST" action="/atnd/event">
			<table border=7 bgcolor="white">
				<tr>
					<th bgcolor="palegreen">Category Id</th>
					<th><input type="text" name="categoryId" value="1" /></th>
				</tr>
				<tr>
					<th bgcolor="palegreen">Event Name</th>
					<th><input type="text" name="eventName" value="ITA 2nd" /></th>
				</tr>
				<tr>
					<th bgcolor="palegreen">Limit</th>
					<th><input type="text" name="limit" value="32" /></th>
				</tr>
				<tr>
					<th bgcolor="palegreen">Overview</th>
					<th><input type="text" name="overview" value="overview" /></th>
				</tr>
			</table>
			<br> <input type="submit" value="create" />
		</form>
	</center>
</body>
</html>
