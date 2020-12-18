<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vista</title>
</head>
<body>
	<c:forEach var="tempProductos" items="${lista_productos}">
		<p>${tempProductos}</p>
	</c:forEach>
</body>
</html>