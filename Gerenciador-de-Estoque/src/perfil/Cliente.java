package perfil;

public class Cliente extends Pessoa{
	
	@Override
	public Boolean validaTipoUsuario() {
		if(this.tipoUsuario != "C") {
			return false;
		}
		return true;
	}
	
	// TODO Criar um método para fazer Reserva
}
