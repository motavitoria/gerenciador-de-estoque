package perfil;

public class Vendedor extends Pessoa{

	@Override
	public Boolean validaTipoUsuario() {
		if(this.tipoUsuario != "V") {
			return false;
		}
		return true;
	}
	
}
