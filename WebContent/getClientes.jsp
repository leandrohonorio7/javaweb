<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import = "dao.*, modelo.*, servlets.*, javadb.jdbc.*" %>

<table>
	<%
		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.getClientes();
		
		for (Cliente cliente : clientes) {	
	%>
	<tr>
		<td><%= "id: " + cliente.getId() %></td>
		<td><%= "Nome: " + cliente.getNome()%></td>
		<td><%= "Emal: " + cliente.getEmail()%></td>
		<td><%= "Endereco: " + cliente.getEndereco()%></td>
	</tr>
	<% } %>
</table>

</body>
</html>