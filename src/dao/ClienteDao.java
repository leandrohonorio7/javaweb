package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import javadb.jdbc.ConnectionFactory;
import modelo.Cliente;

public class ClienteDao {
	private Connection con;
	
	
	public void inserir(Cliente cliente) throws SQLException
	{
		OpenConnection();
		
		String sql = "insert into clientes(nome, email, endereco) values (?,?,?)";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getEndereco());
			
			stmt.execute();
			stmt.close();
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		finally {
			CloseConnection();
		}
	}

	public void editar(Cliente cliente) throws SQLException
	{
		OpenConnection();
		
		String sql = "update clientes set nome=?, email=?, endereco=? where id=?";
			
		try {
			PreparedStatement stmt = this.con.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getEmail());
			stmt.setString(3, cliente.getEndereco());
			stmt.setLong(4, cliente.getId());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		finally {
			CloseConnection();
		}
	}
	
	public void excluir(Cliente cliente) throws SQLException
	{
		OpenConnection();
		
		try {
			String sql = "delete from clientes where id=?";
			PreparedStatement stmt = this.con.prepareStatement(sql);
			stmt.setLong(1, cliente.getId());
			stmt.execute();
			stmt.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		finally {
			CloseConnection();
		}
	}
	
	public List<Cliente> getClientes() throws SQLException
	{
		OpenConnection();
		
		try {
			List<Cliente> clientes = new ArrayList<Cliente>();
			PreparedStatement stmt = con.prepareStatement("select * from clientes");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Cliente c = new Cliente();
				c.setId(rs.getLong("id"));
				c.setEmail(rs.getString("email"));
				c.setEndereco(rs.getString("endereco"));
				
				clientes.add(c);
			}
			return clientes;
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			CloseConnection();
		}
		return null;
	}

	public void OpenConnection() throws SQLException
	{
		this.con = new ConnectionFactory().getConnection();
	}
	
	public void CloseConnection() throws SQLException
	{
		this.con.close();
	}
}
