package model;

public abstract class Pessoa {
	
	private int idUsuario;
	private String nomeUsuario;
	private int senhaUsuario;
	private String tipoUsuario;
	private String cpfUsuario;
	
	public int getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public int getSenhaUsuario() {
		return senhaUsuario;
	}
	
	public void setSenhaUsuario(int senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	public String getCpfUsuario() {
		return cpfUsuario;
	}
	
	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}
	
}
