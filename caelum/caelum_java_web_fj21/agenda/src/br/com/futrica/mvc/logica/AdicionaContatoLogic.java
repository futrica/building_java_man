package br.com.futrica.mvc.logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.futrica.agenda.dao.ContatoDao;
import br.com.futrica.agenda.modelo.Contato;

public class AdicionaContatoLogic implements Logica{
	
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Contato contato = new Contato();
		
		contato.setNome(request.getParameter("nome"));
		contato.setEndereco(request.getParameter("endereco"));
		contato.setEmail(request.getParameter("email"));
		
		//Converte a data de String para Calendar
		String dataEmTexto = request.getParameter("dataNascimento");
		
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(date);
		contato.setDataNascimento(dataNascimento);
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);	

		RequestDispatcher rd = request.getRequestDispatcher("/lista-contatos-elegante.jsp");
		rd.forward(request, response);

		}
}
