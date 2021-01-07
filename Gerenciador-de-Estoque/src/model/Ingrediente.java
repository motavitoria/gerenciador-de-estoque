package model;

public class Ingrediente extends Restaurante {
	
	private String nomeIngrediente;
	private String medida;
	private int quantidade;
	private int quantidadeMinima;
	
	public Ingrediente(int id, String nomeIngrediente, String medida, int quantidade, int quantidadeMinima) {
		this.id = id;
		this.nomeIngrediente = nomeIngrediente;
		this.medida = medida;
		this.quantidade = quantidade;
		this.quantidadeMinima = quantidadeMinima;
	}

	public String getNomeIngrediente() {
		return nomeIngrediente;
	}

	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public void setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	
}
