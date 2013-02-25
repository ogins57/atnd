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
		<form method="POST" action="/atnd/attendance">
			<table border=7 bgcolor="white">
				<tr>
					<th bgcolor="palegreen">Attendace</th>
					<th><input type="text" name="atnd" value="1" /></th>
				</tr>
				<tr>
					<th bgcolor="palegreen">Person Id</th>
					<th><input type="text" name="personId" value="1" /></th>
				</tr>
				<tr>
					<th bgcolor="palegreen">Date Id</th>
					<th><input type="text" name="dateId" value="1" /></th>
				</tr>
			</table>
			<br> <input type="submit" value="create" />
		</form>
	</center>
</body>
</html>
