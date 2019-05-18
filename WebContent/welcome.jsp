<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome JSP</title>
</head>
<body>
<%-- Comentario JSP --%>
<!-- Comentario HTML -->
<% String mensagem = "Bem vindo ao JSP!!!"; %>
<% out.println(mensagem); %><br/><br/> <%--variavel implementada do JSP--%>
<!-- variavel out do tipo JSPWritter que possui o metodo println -->

<h1>Seja bem vindo ao JavaServer Pages</h1>
<%= mensagem %> <br/><br/>
<!-- imprimimos utilizando expresões JSP -->
<% System.out.println("Onde vai sair essa mensagem???"); %>
</body>
</html>