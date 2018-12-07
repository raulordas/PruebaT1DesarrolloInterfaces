package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * Aplicaci�n realizada para la prueba del trimestre T1
 * del m�dulo de Desarrollo de Interfaces.
 * La l�gica de la aplicaci�n se encuentra disponible en las clases controladoras.
 * @author RA�L ORD�S FERN�NDEZ
 * @version 1.0
 * @see application.ControlFX
 * @see application.ControlVentana2
 *
 */
public class MainFX extends Application {
	
	
	/**
	 * Metodo main de la aplicaci�n que lanza el primaryStage que recibe como argumento.
	 * @return no tiene retorno
	 */
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Profile.fxml"));
		try {
			AnchorPane panelPrincipal = loader.load();
			panelPrincipal.getStylesheets().add("https://fonts.googleapis.com/css?family=Poiret+One");
			primaryStage.setScene(new Scene(panelPrincipal));
			primaryStage.setTitle("Aplicaci�n T1 Ra�l Ord�s JAVAFX");
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
