package perfil;

public class Vendedor extends Pessoa{

	@Override
	public Boolean validaTipoUsuario() {
		if(this.tipoUsuario != "V") {
			return false;
		}
		return true;
	}
	
	// TODO Criar um m�todo para criar uma Refei��o
}
