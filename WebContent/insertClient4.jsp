<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="mvc">
	<input type="hidden" name="regra" value="RegraUpdateCliente" >
	<input type="hidden" name="id" value="${param.id}" >
	Nome: <input type="text" name="nome" value="${param.nome}"><br/>
	E-mail: <input type="text" name="email" value="${param.email}"><br/>
	Endereço: <input type="text" name="endereco" value="${param.endereco}"><br/>
	
	<input type="submit" value="Editar">
</form>
</body>
</html>