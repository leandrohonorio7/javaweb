package Testes;

import java.sql.SQLException;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteInsertDadosDao {

	public static void main(String[] args) throws SQLException {
		Cliente cliente = new Cliente();
		cliente.setNome("João");
		cliente.setEmail("joao@joao.com");
		cliente.setEndereco("Av. Sao Joao, 500");
		
		ClienteDao dao = new ClienteDao();
		dao.inserir(cliente);
		
		System.out.println("Cliente gravado com sucesso");
	}

}
