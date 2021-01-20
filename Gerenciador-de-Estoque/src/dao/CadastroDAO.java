package dao;

public interface CadastroDAO {
	
	public abstract void criaUsuario(String tipousuario,String nomeUsuario, String senhaUsuario, String CPFUsuario);
	public abstract boolean verificaTipo(String tipo); // MUDEI DE VOID PARA BOOLEAN
	public abstract boolean tipoValido(String tipo);

}
