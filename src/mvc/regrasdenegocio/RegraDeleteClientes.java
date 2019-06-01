package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

public class RegraDeleteClientes implements Regra{

	@Override
	public String execute(HttpServletRequest requeste, HttpServletResponse response) throws Exception {

		ClienteDao dao = new ClienteDao();
		
		Long id = Long.parseLong(requeste.getParameter("id"));
		
		Cliente cliente = new Cliente();
		cliente.setId(id);
		
		dao.excluir(cliente);
		
		System.out.println("Deletando cliente");

		return "testejstl4.jsp";
	}

} 
