package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CNXHSQLDB {
	
	private String usuario = "SA";
	private String senha = "";
	private String PathBase = "base\\cadastro";
	private String URL = "jdbc:hsqldb:file:" + PathBase + ";";

	public Connection conectar() {
		try {
			return DriverManager.getConnection(URL, usuario, senha);
		} catch (SQLException e) {
			System.out.println("Erro de conex�o: " + e.toString());
			return null;
		}
	}

}
