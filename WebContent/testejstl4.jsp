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
<jsp:useBean id="dao" class="dao.ClienteDao"></jsp:useBean>
<table>
	<c:forEach var="cliente" items="${dao.clientes}">
		<tr>
			<td>${cliente.nome}</td>
			<td>
				<c:if test="${not empty cliente.email}">
					<a href="mailto:${cliente.email}">${cliente.email}</a>
				</c:if>
				
				<c:if test="${empty cliente.email}">
					E-mail não informado2
				</c:if>
			</td>
			<td>${cliente.endereco}</td>
			<td> <a href="mvc?regra=RegraDeleteClientes&id=${cliente.id}">Deletar</a></td>
			<td> <a href="insertClient4.jsp?id=${cliente.id}&nome=${cliente.nome}&email=${cliente.email}&endereco=${cliente.endereco}">Editar</a></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>