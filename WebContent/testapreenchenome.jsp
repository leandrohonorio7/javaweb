<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${empty param.nome}">
		<h2>Campo nome obrigatório</h2>
	</c:if>
	<c:if test="${not empty param.nome}">
		<h2>Obrigado pore inserir seu nome ${param.nome}</h2>
	</c:if>

</body>
</html>