package br.com.web.bootstrap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletBootstrap")
public class ServletBootstrap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletBootstrap() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String login = request.getParameter("login");
		String senha1 = request.getParameter("senha1");
		out.println("<html>"
					+"<body>"
					+"<h1>"+nome+"</h1>"
					+"<b>"+login+"</b>"
					+"<i>"+senha1+"</i>"
					+"</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
