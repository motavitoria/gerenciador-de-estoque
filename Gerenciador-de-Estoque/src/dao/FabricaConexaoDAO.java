package dao;

import java.sql.Connection;

public class FabricaConexaoDAO {
  
	public  static  Connection getConnection(){
        return new ConectaBancoDAO().getConnection();
    }
}
