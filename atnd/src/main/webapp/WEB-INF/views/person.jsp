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
		<form method="POST" action="/atnd/person">
			<table border=7 bgcolor="white">
				<tr>
					<th bgcolor="palegreen">Name</th>
					<th><input type="text" name="name" value="ogi" /></th>
				</tr>
				<tr>
					<th bgcolor="palegreen">Email</th>
					<th><input type="text" name="email" value="xxxx@test.com" /></th>
				</tr>
				<tr>
					<th bgcolor="palegreen">Place Of Work</th>
					<th><input type="text" name="placeOfWork" value="Japan" /></th>
				</tr>
			</table>
			<br> <input type="submit" value="create" />
		</form>
	</center>
</body>
</html>
