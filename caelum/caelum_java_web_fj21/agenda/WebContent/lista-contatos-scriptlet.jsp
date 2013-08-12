<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.futrica.agenda.modelo.Contato"%>
<%@page import="java.util.List"%>
<%@page import="br.com.futrica.agenda.dao.ContatoDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Lista Contatos</title>
	</head>

	<body>
	
	
	<table>
			<tr>
				<td> Nome</td>
				<td> Email</td>
				<td> Endereço</td>
				<td> Data Nascimento </td>
			</tr>
		<% 
			String espelho = "dd/MM/yyyy";
        	SimpleDateFormat dateFormat = new SimpleDateFormat(espelho);    
			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.getLista(); 
			
			for (Contato contato : contatos) {
		%>
			<tr>
				<td> <%=contato.getNome() %></td>
				<td> <%= contato.getEmail() %></td>
				<td><%=contato.getEndereco() %></td>
				<td><%=dateFormat.format(contato.getDataNascimento().getTime())%> </td>
			</tr>
		<% 
			}
		%>
	</table>
	
	
		
		
	</table>
	</body>
</html>