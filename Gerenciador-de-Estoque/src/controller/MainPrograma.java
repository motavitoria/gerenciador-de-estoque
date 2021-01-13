package controller;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainPrograma extends Application {

	private static Stage stage;
	
	private static Scene loginScene;
	private static Scene criaCadastroScene;
	private static Scene menuPrincipalVendedorScene;
	private static Scene refeicaoScene;
	private static Scene criaRefeicaoScene;
	private static Scene criaPratoScene;
	private static Scene criaIngredienteScene;
	private static Scene reservaAgendadasScene;
	private static Scene estoqueScene;
	private static Scene menuPrincipalClienteScene;
	private static Scene visualizaReservasScene;
	private static Scene buscaRefeicoesScene;
	private static Scene criaReservaScene;
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		
		stage = primaryStage;
		
		primaryStage.setTitle("BomGosto - Seu gerenciador de Estoque");
		
		Parent fxmlLogin = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
		loginScene = new Scene(fxmlLogin);
		
		Parent fxmlCriaCadastro = FXMLLoader.load(getClass().getResource("../view/CriaCadastro.fxml"));
		criaCadastroScene = new Scene(fxmlCriaCadastro);
		
		Parent fxmlMenuPrincipalVendedor = FXMLLoader.load(getClass().getResource("../view/MenuPrincipal.fxml"));
		menuPrincipalVendedorScene = new Scene(fxmlMenuPrincipalVendedor);
		
		Parent fxmlRefeicao = FXMLLoader.load(getClass().getResource("../view/Refeicao.fxml"));
		refeicaoScene = new Scene(fxmlRefeicao);
		
		Parent fxmlCriaRefeicao = FXMLLoader.load(getClass().getResource("../view/CriaRefeicao.fxml"));
		refeicaoScene = new Scene(fxmlCriaRefeicao);
		
		Parent fxmlCriaPrato = FXMLLoader.load(getClass().getResource("../view/CriaPrato.fxml"));
		criaPratoScene = new Scene(fxmlCriaPrato);
		
		Parent fxmlCriaIngrediente = FXMLLoader.load(getClass().getResource("../view/CriaIngrediente.fxml"));
		criaIngredienteScene = new Scene(fxmlCriaIngrediente);
		
		Parent fxmlReserva = FXMLLoader.load(getClass().getResource("../view/Reserva.fxml"));
		reservaAgendadasScene = new Scene(fxmlReserva);
		
		Parent fxmlEstoque = FXMLLoader.load(getClass().getResource("../view/Estoque.fxml"));
		estoqueScene = new Scene(fxmlEstoque);
		
		Parent fxmlMenuPrincipalCliente = FXMLLoader.load(getClass().getResource("../view/MenuPrincipalCliente.fxml"));
		menuPrincipalClienteScene = new Scene(fxmlMenuPrincipalCliente);
		
		Parent fxmlVisualizaReservasCliente = FXMLLoader.load(getClass().getResource("../view/VisualizaReservasCliente.fxml"));
		visualizaReservasScene = new Scene(fxmlVisualizaReservasCliente);
		
		Parent fxmlBuscaRefeicoesCliente = FXMLLoader.load(getClass().getResource("../view/BuscaRefeicoesCliente.fxml"));
		buscaRefeicoesScene = new Scene(fxmlBuscaRefeicoesCliente);
		
		Parent fxmlCriaReserva = FXMLLoader.load(getClass().getResource("../view/CriaReserva.fxml"));
		criaReservaScene = new Scene(fxmlCriaReserva);
		
		primaryStage.setScene(loginScene);
		primaryStage.show();
		
	}
	
	public static void mudaTela(String source, Object objetoData) {
		switch (source) {
			case "login":
				stage.setScene(loginScene);
				notifyAllListeners("login", objetoData);
				break;
			case "criaCadastro":
				stage.setScene(criaCadastroScene);
				notifyAllListeners("criaCadastro", objetoData);
				break;
			case "menuPrincipalVendedor":
				stage.setScene(menuPrincipalVendedorScene);
				notifyAllListeners("menuPrincipalVendedor", objetoData);
				break;
			case "refeicao":
				stage.setScene(refeicaoScene);
				notifyAllListeners("refeicao", objetoData);
				break;
			case "criaRefeicao":
				stage.setScene(criaRefeicaoScene);
				notifyAllListeners("criaRefeicao", objetoData);
				break;
			case "criaPrato":
				stage.setScene(criaPratoScene);
				notifyAllListeners("criaPrato", objetoData);
				break;
			case "criaIngrediente":
				stage.setScene(criaIngredienteScene);
				notifyAllListeners("criaIngrediente", objetoData);
				break;
			case "reserva":
				stage.setScene(reservaAgendadasScene);
				notifyAllListeners("reserva", objetoData);
				break;
			case "estoque":
				stage.setScene(estoqueScene);
				notifyAllListeners("estoque", objetoData);
				break;
			case "menuPrincipalCliente":
				stage.setScene(menuPrincipalClienteScene);
				notifyAllListeners("menuPrincipalCliente", objetoData);
				break;
			case "visualizaReservas":
				stage.setScene(visualizaReservasScene);
				notifyAllListeners("visualizaReservas", objetoData);
				break;
			case "buscaRefeicoes":
				stage.setScene(buscaRefeicoesScene);
				notifyAllListeners("buscaRefeicoes", objetoData);
				break;
			case "criaReserva":
				stage.setScene(criaReservaScene);
				notifyAllListeners("criaReserva", objetoData);
				break;
		}
	}
	
	public static void mudaTela(String source) {
		mudaTela(source, null);
	}
	
	private static ArrayList<onChangeScreen> listeners = new ArrayList<>();
	
	public static interface onChangeScreen {
		void onScreenChanged(String novaTela, Object objetoData);
	}
	
	public static void addOnChangeScreenListener(onChangeScreen novoListener) {
		listeners.add(novoListener);
	}
	
	private static void notifyAllListeners(String novaTela, Object objetoData) {
		for(onChangeScreen l : listeners) {
			l.onScreenChanged(novaTela, objetoData);
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
