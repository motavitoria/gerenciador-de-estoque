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
	private static Scene menuPrincipalScene;
	private static Scene refeicaoScene;
	private static Scene criaRefeicaoScene;
	private static Scene criaPratoScene;
	private static Scene criaIngredienteScene;
	private static Scene reservaScene;
	private static Scene criaReservaScene;
	private static Scene estoqueScene;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		stage = primaryStage;
		
		primaryStage.setTitle("AGE - Seu gerenciado de Estoque");
		
		Parent fxmlLogin = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));	
		loginScene = new Scene(fxmlLogin);
		
		Parent fxmlMenuPrincipal = FXMLLoader.load(getClass().getResource("../view/MenuPrincipal.fxml"));	
		menuPrincipalScene = new Scene(fxmlMenuPrincipal);
		
		Parent fxmlRefeicao = FXMLLoader.load(getClass().getResource("../view/Refeicao.fxml"));	
		refeicaoScene = new Scene(fxmlRefeicao);
		
		Parent fxmlCriaRefeicao = FXMLLoader.load(getClass().getResource("../view/CriaRefeicao.fxml"));	
		criaRefeicaoScene = new Scene(fxmlCriaRefeicao);
		
		Parent fxmlCriaPrato = FXMLLoader.load(getClass().getResource("../view/CriaPrato.fxml"));	
		criaPratoScene = new Scene(fxmlCriaPrato);
		
		Parent fxmlCriaIngrediente = FXMLLoader.load(getClass().getResource("../view/CriaIngrediente.fxml"));	
		criaIngredienteScene = new Scene(fxmlCriaIngrediente);
		
		Parent fxmlReserva = FXMLLoader.load(getClass().getResource("../view/Reserva.fxml"));	
		reservaScene = new Scene(fxmlReserva);
		
		Parent fxmlCriaReserva = FXMLLoader.load(getClass().getResource("../view/CriaReserva.fxml"));	
		criaReservaScene = new Scene(fxmlCriaReserva);
		
		Parent fxmlEstoque = FXMLLoader.load(getClass().getResource("../view/Estoque.fxml"));	
		estoqueScene = new Scene(fxmlEstoque);
		
		primaryStage.setScene(menuPrincipalScene);
		primaryStage.show();
		
	}
	
	public static void mudaTela(String source, Object objetoData) {
		switch (source) {
			case "refeicao":
				stage.setScene(refeicaoScene);
				notifyAllListeners("refeicao", objetoData);
				break;
			case "criaRefeicao":
				stage.setScene(criaRefeicaoScene);
				notifyAllListeners("criaRefeicao", objetoData);
				break;
			case "menuPrincipal":
				stage.setScene(menuPrincipalScene);
				notifyAllListeners("menuPrincipal", objetoData);
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
				stage.setScene(reservaScene);
				notifyAllListeners("reserva", objetoData);
				break;
			case "criaReserva":
				stage.setScene(criaReservaScene);
				notifyAllListeners("criaReserva", objetoData);
				break;
			case "estoque":
				stage.setScene(estoqueScene);
				notifyAllListeners("estoque", objetoData);
				break;
		}
	}
	
	public static void mudaTela(String source) {
		mudaTela(source, null);
	}
	
	public static ArrayList<OnChangeScreen> listeners = new ArrayList<>();
	
	public static interface OnChangeScreen{
		public void onScreenChanged(String novaTela, Object objetoData);
	}
	
	public static void addOnChangeScreenListener(OnChangeScreen newListener) {
		listeners.add(newListener);
	}
	
	private static void notifyAllListeners(String novaTela, Object objetoData) {
		for(OnChangeScreen l : listeners) {
			l.onScreenChanged(novaTela, objetoData);
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
