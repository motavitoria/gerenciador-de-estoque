package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class ConectaBancoDAO extends ConexaoBancoDAO { 
	
	public ConectaBancoDAO(){
		this.driver = "com.mysql.cj.jdbc.Driver";
		this.porta = 3306;
		this.servidor = "localhost";
		this.bd = "gerenciador_de_estoque";
		this.usuario = "root";
		this.senha = "ElefanteComBanana29";

	}
        
	@Override
	public Connection getConnection() {
	   try {
	        
	        Class.forName(driver);
	        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	        Connection conn = DriverManager.getConnection(getURL(), usuario, senha);
	
	    } catch (SQLException ex) {
	        Logger.getLogger(ConectaBancoDAO.class.getName()).log(Level.SEVERE, null, ex);
	        JOptionPane.showMessageDialog(null, "ERRO AO CARREGAR DRIVE");
	    } catch (ClassNotFoundException ex) {
	        Logger.getLogger(ConectaBancoDAO.class.getName()).log(Level.SEVERE, null, ex);
	    }
	    return conn;
	}
        
	@Override
	public String getURL() {
	    return "jdbc:mysql://" + this.servidor + ":" + this.porta + "/" + this.bd 
	            + "?useTimezone=true&serverTimezone=UTC";
	}

}