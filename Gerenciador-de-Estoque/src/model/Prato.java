package model;

import java.util.List;

public class Prato extends Restaurante {
	
	private String tipo;
	private String nomePrato;
	private int quantidadeLimite;
	private long preco;
	private List<Ingrediente> ingredientes;
	
	public Prato(int id, String tipo, String nomePrato, int quantidadeLimite, long preco, List<Ingrediente> ingredientes) {
		this.id = id;
		this.tipo = tipo;
		this.nomePrato = nomePrato;
		this.quantidadeLimite = quantidadeLimite;
		this.preco = preco;
		this.ingredientes = ingredientes;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getNomePrato() {
		return nomePrato;
	}
	
	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}
	
	public int getQuantidadeLimite() {
		return quantidadeLimite;
	}
	
	public void setQuantidadeLimite(int quantidadeLimite) {
		this.quantidadeLimite = quantidadeLimite;
	}
	
	public long getPreco() {
		return preco;
	}
	
	public void setPreco(long preco) {
		this.preco = preco;
	}
	
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
}
