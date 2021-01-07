package conexao;

import java.sql.Connection;

public class ConstroiConexao {
  
	public  static  Connection getConnection(){

        return new ConectaMySQL().getConnection();

    }
}
