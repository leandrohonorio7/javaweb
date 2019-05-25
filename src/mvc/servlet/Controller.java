package mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.regrasdenegocio.Regra;

@SuppressWarnings("serial")
@WebServlet("/mvc")
public class Controller extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest requeste, HttpServletResponse response) throws ServletException, IOException {
		
		String paramview = requeste.getParameter("regra");
		String nomeDaAction = "mvc.regrasdenegocio." + paramview;
		
		try {
			Class<?> classe = Class.forName(nomeDaAction);
			Regra logica = (Regra) classe.newInstance();
			String page = logica.execute(requeste, response);
			requeste.getRequestDispatcher(page).forward(requeste,response);
		}
		catch (Exception e) {
			throw new ServletException(e);
		}
	}

}
