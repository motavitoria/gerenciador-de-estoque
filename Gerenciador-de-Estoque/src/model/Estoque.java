package model;

import java.util.List;

public class Estoque extends Restaurante {
	
	private List<Reserva> reservas;
	private List<Ingrediente> ingredientesEstoque;
	
	public List<Reserva> getReservas() {
		return reservas;
	}
	
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	public List<Ingrediente> getIngredientesEstoque() {
		return ingredientesEstoque;
	}
	
	public void setIngredientesEstoque(List<Ingrediente> ingredientesEstoque) {
		this.ingredientesEstoque = ingredientesEstoque;
	}
	
	public void calculaEstoque(List<Reserva> reservas, List<Ingrediente> ingredientesEstoque) {
		// TODO Implementar calculo de estoque para atualização de dados em tela;
	}
	
}
