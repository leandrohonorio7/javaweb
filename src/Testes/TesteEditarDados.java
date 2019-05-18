package Testes;

import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import dao.ClienteDao;
import modelo.Cliente;

public class TesteEditarDados {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		ClienteDao dao = new ClienteDao();
		List<Cliente> clientes = dao.getClientes();
		
		Cliente c = clientes.get(0);
		
		System.out.println("Cliente editado DE - id: " + c.getId() + " Nome: " + c.getNome() + " Emal: " + c.getEmail() + " Endereco: " + c.getEndereco());
		
				
		c.setNome("Monica " + getRandomNumberInRange(1, 10));
		c.setEmail("email@email.com.br");
		c.setEndereco("teste");
		
		System.out.println("Cliente editado PARA - id: " + c.getId() + " Nome: " + c.getNome() + " Emal: " + c.getEmail() + " Endereco: " + c.getEndereco());
		
		dao.editar(c);
	}
	
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
