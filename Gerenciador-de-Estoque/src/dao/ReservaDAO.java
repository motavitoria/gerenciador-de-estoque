package dao;

import java.sql.SQLException;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;
public class ReservaDAO implements RestauranteDAO  {

	@Override
	public void cria() {
            
            /*
            try{
                Connection con = (Connection) ConstroiConexao.getConnection();
                String sql = String.format(""INSERT INTO my_table (col_string) VALUES('a string')"");
                con.executeUpdate(sql);
                }catch (SQLException ex){
                    
                }
            */    
	}

	@Override
	public void atualiza() {
		//Atualizo o que?
	}

	@Override
	public void exclui() {
		
	}

	@Override
	public void busca() {
		
	}

}
