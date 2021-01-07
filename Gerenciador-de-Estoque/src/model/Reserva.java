package refeicao;

import java.util.Date;

public class Reserva extends Estoque{
	
	protected int quantidadeReserva;

	public Reserva(int idObjeto) {
		super(idObjeto);
		// TODO Auto-generated constructor stub
	}

	public int getQuantidadeReserva() {
		return quantidadeReserva;
	}

	public void setQuantidadeReserva(int quantidadeReserva) {
		this.quantidadeReserva = quantidadeReserva;
	}

	
	public void excluiReserva(int idObjeto) {
		// TODO criar uma String sql com a query de DELETE
		
	}

	
	public void criaReserva(int quantidadeReserva, int idObjeto) {
		// TODO criar uma String sql com a query de INSERT
		
	}


}
