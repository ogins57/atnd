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
		<form method="POST" action="/atnd/date">
			<table border=7 bgcolor="white">
				<tr>
					<th bgcolor="palegreen">Count Of Participant</th>
					<th><input type="text" name="countOfParticipant" value="17" /></th>
				</tr>
				<tr>
					<th bgcolor="palegreen">Place</th>
					<th><input type="text" name="place" value="12F" /></th>
				</tr>
			</table>
			<br> <input type="submit" value="create" />
		</form>
	</center>
</body>
</html>
