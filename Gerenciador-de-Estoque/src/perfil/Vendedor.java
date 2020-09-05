package perfil;

public class Vendedor extends Pessoa{

	@Override
	public Boolean validaTipoUsuario() {
		if(this.tipoUsuario != "V") {
			return false;
		}
		return true;
	}
	
	// TODO Criar um método para criar uma Refeição
}
