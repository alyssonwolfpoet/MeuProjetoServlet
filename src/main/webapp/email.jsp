<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bem vindo Logado</title>
</head>
<body>
	<h2>logado com sucesso</h2>
	<h3><%= session.getAttribute("usuario") %></h3>
	 <button onclick="window.location.href='formlogin.html'">Ir para a página de login</button>
</body>
</html>