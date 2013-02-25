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
		<form method="POST" action="/atnd/category">
			<table border=7 bgcolor="white">
				<tr>
					<th bgcolor="palegreen">Category Name</th>
					<th><input type="text" name="categoryName" value="ITA tokyo" /></th>
				</tr>
			</table>
			<br>
			<input type="submit" value="create" />
		</form>
	</center>
</body>
</html>