package br.com.futrica.mvc.logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.futrica.agenda.dao.ContatoDao;
import br.com.futrica.agenda.modelo.Contato;

public class RemoveContatoLogic implements Logica{
	

	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Contato contato = new Contato();
		long id = Long.parseLong(request.getParameter("id"));
		
		contato.setId(id);		
		ContatoDao dao = new ContatoDao();
		dao.remove(contato);
		
		RequestDispatcher rd = request.getRequestDispatcher("/lista-contatos-elegante.jsp");
		rd.forward(request, response);
		System.out.println("Removendo contato ..." + contato.getNome());
	}
}
