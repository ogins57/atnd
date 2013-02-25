<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ page contentType="text/html; charset=UTF-8" session="false"%>
<html>
<head>
<title>ITAコミュニティ（東京）</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="<c:url value="/resources/stylesheets/layouts.css" />"
	type="text/css" />
</head>

<body>
	<!-- Header -->
	<div id="header">
		<tiles:insertAttribute name="header" />
	</div>

	<!-- Menu -->
	<div id="menu">
		<tiles:insertAttribute name="menu" />
	</div>

	<!-- Main -->
	<div id="main">
		<br>
		<tiles:insertAttribute name="main" />
	</div>
</body>
</html>