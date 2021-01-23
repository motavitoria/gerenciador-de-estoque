package model;

public abstract class Pessoa {
	
	private int idUsuario;
	private String nomeUsuario;
	private String senhaUsuario; // MUDEI VER DE INT PARA STRING CONFIRMAR SE È DE BOA - ME BASEEI NO BD
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
	
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	
	public void setSenhaUsuario(String senhaUsuario) {
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
	
	public void setCPFUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}
	
}
