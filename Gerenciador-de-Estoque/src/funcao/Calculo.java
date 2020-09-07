package funcao;

import refeicao.Estoque;
import refeicao.Ingrediente;
import perfil.Cliente;

public class Calculo {
	
	private int idObjeto;
	private Ingrediente ingrediente = new Ingrediente(idObjeto);
	private Cliente cliente = new Cliente();
	
	public void adicionaIngrediente(int somaIngrediente) {
		
		int resultadoSoma;
		
		resultadoSoma = ingrediente.getQuantidadeIngrediente() + somaIngrediente;
		ingrediente.setQuantidadeIngrediente(resultadoSoma);
		
	}
	
	public void retiraIngrediente(int subtraeIngrediente) {
		
		int resultadoSubtracao;
		
		resultadoSubtracao = ingrediente.getQuantidadeIngrediente() - subtraeIngrediente;
		
		if(resultadoSubtracao >= 0) {
			
			ingrediente.setQuantidadeIngrediente(resultadoSubtracao);
			
		}
	}
	
	public void adicionaCarrinho(int somaCarrinho) {
		
		int resultadoSomaCarrinho;
		
		resultadoSomaCarrinho = cliente.getCarrinho() + somaCarrinho;
		cliente.setCarrinho(somaCarrinho);
		
	}
	public void retiraCarrinho(int subtraeCarrinho) {
		
		int resultadoSubtraeCarrinho;
		
		resultadoSubtraeCarrinho = cliente.getCarrinho() + subtraeCarrinho;
		cliente.setCarrinho(resultadoSubtraeCarrinho);
		
	}
	
}