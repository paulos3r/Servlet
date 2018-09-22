package br.com.web.bootstrap;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.web.modelo.Livro;

/**
 * Servlet implementation class ServleLivro
 */
@WebServlet("/ServleLivro")
public class ServleLivro extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServleLivro() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Livro livro = new Livro();
		livro.setAltor("Pedro");
		livro.setDescricao("Futebol");
		livro.setTitulo("Jogador de Futebol");
		
		Livro livro2 = new Livro();
		livro2.setAltor("Patric");
		livro2.setDescricao("Futebol2");
		livro2.setTitulo("Jogador de Futebol2");
		
		Livro livro3 = new Livro();
		livro3.setAltor("Paulo");
		livro3.setDescricao("Type book");
		livro3.setTitulo("livro de tipo");
		
		Livro livro4 = new Livro();
		livro4.setAltor("Marcus");
		livro4.setDescricao("Martis");
		livro4.setTitulo("Marte");
		
		ArrayList<Livro> lista = new ArrayList<>();
		lista.add(livro);
		lista.add(livro2);
		lista.add(livro3);
		lista.add(livro4);
		                    //listalivro e uma variavel recebendo meu parametro lista
							//enviando para JSP na variavel listalivro
		request.setAttribute("listalivro", lista);
							//recebendo requisição e armazenando na variavel
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/ListarLivros.jsp");
							
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
