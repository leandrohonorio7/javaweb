package Testes;

import java.sql.SQLException;
import java.util.List;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteGetClientes {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.getClientes();
		
		for (Cliente cliente : clientes) {
			System.out.println("id: " + cliente.getId());
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Emal: " + cliente.getEmail());
			System.out.println("Endereco: " + cliente.getEndereco());
		}
		
	}

}
