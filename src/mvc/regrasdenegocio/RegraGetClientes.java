package mvc.regrasdenegocio;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

public class RegraGetClientes implements Regra {

	@Override
	public String execute(HttpServletRequest requeste, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.getClientes();
		
		requeste.setAttribute("clientes", clientes);		
		return "/WEB-INF/pages/testejstl3.jsp";
	}

}
