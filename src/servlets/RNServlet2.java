package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

@WebServlet("/rnservletadiciona2")
@SuppressWarnings("serial")
public class RNServlet2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		
		String action = request.getParameter("regra");
		
		ClienteDao dao = new ClienteDao();
		try
		{
			if(action.equals("InserirCliente")) {
				Cliente cliente = new Cliente();
				
				cliente.setNome(request.getParameter("nome"));
				cliente.setEmail(request.getParameter("email"));
				cliente.setEndereco(request.getParameter("endereco"));
				
				dao.inserir(cliente);
				
				RequestDispatcher rd = request.getRequestDispatcher("insertclienteok.jsp");
				rd.forward(request, response);
			}
			else if(action.equals("GetClientes"))
			{
				List<Cliente> clientes = dao.getClientes();
			}
			else if(action.equals("DeleteClientes"))
			{
				
			}
			
			//código fazendo extract class 
			
		}
		catch(SQLException e)
		{
			
		}
	
	}
}
