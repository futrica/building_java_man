<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Bem vindo!</title>
	</head>
	
	<body>
	<%-- primeira página jsp --%>
	
	<% String mensagem = "bem vindo"; %>
	<% out.println(mensagem); %> <br/>
	
	<% String desenvolvido = "desenvolvido por futrica"; %>
	<%= desenvolvido %> <br/>
	
	
	<% System.out.println("Tudo executado"); %>

	</body>
</html>