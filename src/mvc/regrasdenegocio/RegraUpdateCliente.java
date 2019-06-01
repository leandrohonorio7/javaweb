package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

public class RegraUpdateCliente implements Regra{

	@Override
	public String execute(HttpServletRequest requeste, HttpServletResponse response) throws Exception {

		ClienteDao dao = new ClienteDao();
		
		Long id = Long.parseLong(requeste.getParameter("id"));
		String nome = requeste.getParameter("nome");
		String email = requeste.getParameter("email");
		String endereco = requeste.getParameter("endereco");
		
		Cliente client = new Cliente();
		client.setId(id);
		client.setNome(nome);
		client.setEmail(email);
		client.setEndereco(endereco);

		dao.editar(client);
	
		System.out.println("Edição do cliente: " + client.getNome());

		return "testejstl4.jsp";
		//return "/WEB-INF/pages/testejstl3.jsp";
	}

} 
