<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>

<c:import url="cabecalho.jsp" />

Formul�rio para adicionar contatos:<br/>

<form action="mvc" method="POST">

	Nome: <input type="text" name="nome"  /><br/>
	E-mail: <input type="text" name="email"/><br/>
	Endere�o: <input type="text" name="endereco"/><br/>
	Data de Nascimento: <caelum:campoData id="dataNascimento" />
	<input type="hidden" name="logica" value="AdicionaContatoLogic"/>
	<input type="submit" value="Enviar"/>
</form>

<c:import url="rodape.jsp" />