<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p> notre carnet</p>
<c:forEach var="item" items="${document}">
<tr>
<td>${item.getName()}</td>
<td>${item.getCompany()}</td>
<td>${item.getEmail()}</td>
<td>${item.getNumber()}</td>
</tr>
</c:forEach>

</body>
</html>