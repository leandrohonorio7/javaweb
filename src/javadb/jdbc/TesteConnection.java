package javadb.jdbc;

import java.sql.Connection;

public class TesteConnection {

	public static void main(String[] args) {
		Connection conn = new ConnectionFactory().getConnection();
		
		if(conn != null) System.out.println("ok, conexão aberta");
		else System.out.println("conexão não pode ser aberta");

	}

}
