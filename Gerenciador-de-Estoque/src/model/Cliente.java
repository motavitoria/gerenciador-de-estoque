package model;

import java.util.List;

public class Cliente extends Pessoa{
	
	private int totalReservas;
	private List<Reserva> reservas;
	
	
	public int getTotalReservas() {
		return totalReservas;
	}
	
	public void setTotalReservas(int totalReservas) {
		this.totalReservas = totalReservas;
	}
	
	public List<Reserva> getReservas(int idUsuario) {
		return reservas;
	}
	
	public void setReservas( ) {
            
	}
	
}
