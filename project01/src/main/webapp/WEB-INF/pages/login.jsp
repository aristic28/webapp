<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>


<h2>Prijavili ste se na aplikaciju</h2>

<c:url value="/application/manufacturer" var="listall"></c:url>
<a href="${listall }">Prikazi sve proizvodjace</a>

</body>
</html>