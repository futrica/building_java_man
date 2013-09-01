package br.com.futrica.mvc.logica;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.futrica.agenda.dao.ContatoDao;
import br.com.futrica.agenda.modelo.Contato;

public class TesteAlteraLogic implements Logica {
	

	    public void executa(HttpServletRequest req, HttpServletResponse res) throws Exception {  
	        Long id = Long.parseLong(req.getParameter("id"));  
	        ContatoDao dao = new ContatoDao();  
	        Contato contato = dao.pesquisar(id);  
	        req.setAttribute("nome", contato.getNome());  
	        req.setAttribute("email", contato.getEmail());  
	        req.setAttribute("endereco", contato.getEndereco());  
	        req.setAttribute("nascimento", contato.getDataNascimento());  
	  
	        RequestDispatcher rd = req.getRequestDispatcher("testa-altera-mvc.jsp");  
	        rd.forward(req, res);  
	    } 
		
}

