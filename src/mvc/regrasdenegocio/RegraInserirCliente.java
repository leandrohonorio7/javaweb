package mvc.regrasdenegocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ClienteDao;
import modelo.Cliente;

public class RegraInserirCliente implements Regra{

	@Override
	public String execute(HttpServletRequest requeste, HttpServletResponse response) throws Exception {

		ClienteDao dao = new ClienteDao();
		
		String nome = requeste.getParameter("nome");
		String email = requeste.getParameter("email");
		String endereco = requeste.getParameter("endereco");
		
		Cliente client = new Cliente();
		client.setNome(nome);
		client.setEmail(email);
		client.setEndereco(endereco);

		dao.inserir(client);
	
		System.out.println("Inserindo cliente: " + client.getNome());

		return "/WEB-INF/pages/testejstl3.jsp";
	}

} 
