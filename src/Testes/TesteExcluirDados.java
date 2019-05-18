package Testes;

import java.sql.SQLException;
import java.util.List;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteExcluirDados {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.getClientes();
		
		Cliente cliente = clientes.get(0);
		
		if(cliente != null)
		{
			dao.excluir(cliente);	
			System.out.println("Cliente excluido id: " + cliente.getId() + "Nome: " + cliente.getNome() + "Emal: " + cliente.getEmail() + "Endereco: " + cliente.getEndereco());
		}
		else
			System.out.println("Não ha usuários para serem excluidos");
	}

}
