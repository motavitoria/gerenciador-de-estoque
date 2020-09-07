package conexao;

import java.sql.Connection;

public abstract class ConexaoBD {
	 protected Connection conn;
	 protected String servidor;
	 protected String bd;
	 protected String usuario;
	 protected String senha;
	 protected String driver;
     protected int porta;
     
     public abstract Connection getConnection();

     public abstract  String getURL();
}
