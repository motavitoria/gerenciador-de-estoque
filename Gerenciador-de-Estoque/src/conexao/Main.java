package conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		
        try {
            Connection conn = (Connection) ConstroiConexao.getConnection();
            String sql = "SELECT * FROM gerenciador_de_estoque.login;";
            Statement stm = (Statement) conn.createStatement();
            ResultSet rset = stm.executeQuery(sql);

            while (rset.next()) {
                System.out.println(rset.getString("user"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
		
		
	}
	
}
