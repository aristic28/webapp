<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Proizvodjaci:</h2>

<div>
				<table>
					<thead>
						<tr>
							<th>Pib</th>
							<th>Maticni Broj</th>
							<th>Adresa</th>
							<th>Mesto</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="manufacturer" items="${manufacturers}">
							<tr>
								<th>${manufacturer.pib}</th>
								<th>${manufacturer.maticniBroj}</th>
								<th>${manufacturer.adresa}</th>
								<th>${manufacturer.mesto}</th>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>

</body>
</html>