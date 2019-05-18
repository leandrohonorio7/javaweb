package Testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javadb.jdbc.ConnectionFactory;

public class TesteInsertDados2 {
	public static void main(String[] args) throws SQLException
	{
		Connection con = null;
		String sql = "insert into clientes(nome, email, endereco) values (?,?,?)";
		
		PreparedStatement stmt;
		
		
		try {
			
			con = new ConnectionFactory().getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, "Maria");
			stmt.setString(2, "maria@maria.com");
			stmt.setString(3, "Av. Brasil, 100");
			
			stmt.execute();
			stmt.close();
			
			System.out.println("Gravado com sucesso");
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
}
