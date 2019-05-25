package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

@WebServlet("/rnservletadiciona")
@SuppressWarnings("serial")
public class RNServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		
		Cliente client = new Cliente();
		client.setNome(nome);
		client.setEmail(email);
		client.setEndereco(endereco);

		ClienteDao dao = new ClienteDao();
		try {
			dao.inserir(client);
			
			RequestDispatcher rd = request.getRequestDispatcher("insertclienteok.jsp");
			rd.forward(request, response);
			
			
/*			out.println("<html>");
			out.println("<body>");
			out.println("Cliente " + client.getNome() + "foi inserido com sucesso.");
			out.println("</body>");
			out.println("</html>");
			*/
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
