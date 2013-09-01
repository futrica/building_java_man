<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>

<c:import url="cabecalho.jsp" />

Formulário para alteração de contatos:<br/>

<form action="mvc" method="POST">  
    Id: <input  type="text" name="id" value="${param.id}" readonly/><br/>  
    Nome: <input type="text" name="nome" value="${requestScope.nome}"/><br/>  
    E-mail: <input type="text" name="email" value="${requestScope.email}"/><br/>  
    Endereço: <input type="text" name="endereco" value="${requestScope.endereco}"/><br/>  
    Data de nascimento: <input type="text" name="dataNascimento" value="${requestScope.nascimento}"/><br/>  
    <input type="hidden" name="logica" value="AlteraContatoLogic"/>  
    <input type="submit" value="Salvar"/>  
</form>  

<c:import url="rodape.jsp" />