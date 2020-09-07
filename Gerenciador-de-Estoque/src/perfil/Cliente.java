package perfil;

public class Cliente extends Pessoa{
		
	private int carrinho;
	
	@Override
	public Boolean validaTipoUsuario() {
		if(this.tipoUsuario != "C") {
			return false;
		}
		return true;
	}
	
	public int getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(int carrinho) {
		this.carrinho = carrinho;
	}
	
}
