package javadb.jdbc;

import java.sql.Connection;

public class TesteConnection {

	public static void main(String[] args) {
		Connection conn = new ConnectionFactory().getConnection();
		
		if(conn != null) System.out.println("ok, conex�o aberta");
		else System.out.println("conex�o n�o pode ser aberta");

	}

}
