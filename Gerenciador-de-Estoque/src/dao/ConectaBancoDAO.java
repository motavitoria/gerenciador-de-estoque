package conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConectaMySQL extends ConexaoBD { 
	
public ConectaMySQL(){
    this.driver = "com.mysql.cj.jdbc.Driver";
    this.porta = 3306;
    this.servidor = "localhost";
    this.bd = "gerenciador_de_estoque";
    this.usuario = "root";
    this.senha = "E4e5e6&7";

}

	@Override
	public Connection getConnection() {
	   /*try {
	        
	        Class.forName(driver);
	        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	        conn = DriverManager.getConnection(getURL(), usuario, senha);
	
	    } catch (SQLException ex) {
	        Logger.getLogger(ConectaMySQL.class.getName()).log(Level.SEVERE, null, ex);
	        JOptionPane.showMessageDialog(null, "ERRO AO CARREGAR DRIVE");
	    } catch (ClassNotFoundException ex) {
	        Logger.getLogger(ConectaMySQL.class.getName()).log(Level.SEVERE, null, ex);
	    }*/
	
	    return conn;
	
	}

	@Override
	public String getURL() {
	    return "jdbc:mysql://" + this.servidor + ":" + this.porta + "/" + this.bd 
	            + "?useTimezone=true&serverTimezone=UTC";
	}

}