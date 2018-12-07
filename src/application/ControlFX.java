package application;

import java.io.IOException;
import com.jfoenix.controls.JFXButton;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * Clase controladora que contiene la lógica de negocio correspondiente
 * a la interfaz gráfica de la ventana principal de la aplicación.
 * @author RAÚL ORDÁS FERNÁNDEZ
 * @version 1.0
 *
 */
public class ControlFX {
	@FXML
	private AnchorPane ventanaPrincipal, ventanaSecundaria, panelMenu;
	
	@FXML
	private JFXButton botonAceptar;
	
	@FXML
	private ImageView imagen;
	
	public void initialize() {
		fadeIn();
	}
	
	
	/**
	 * Metodo void que carga la segunda ventana de la aplicación
	 * @return no tiene retorno
	 */
	public void sendStage() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("view/GetMe.fxml"));
		try {
			ventanaSecundaria = loader.load();
			Stage st = new Stage();
			st.setScene(new Scene(ventanaSecundaria));
			st.centerOnScreen();
			st.show();
			closeStage();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo void que cierra el stage de la primera ventana de la aplicación
	 * @return no tiene retorno
	 */
	public void closeStage() {
		Stage st = (Stage) ventanaPrincipal.getScene().getWindow();
		st.close();
	}
	
	/**
	 * Método void que al realizar hover sobre el botón aceptar cambia el background a color negro
	 * @return no tiene retorno
	 */
	public void hover() {
		botonAceptar.setStyle("-fx-background-color: black");
	}
	
	/**
	 * Metodo void que al hacer release del botón aceptar, cambia el background a color naranja
	 * @return no tiene retorno
	 */
	public void unHover() {
		botonAceptar.setStyle("-fx-background-color: orange");
	}
	
	/**
	 * Método void que realiza un fade in de una imagen al iniciar la aplicación
	 * @return no tiene retorno
	 */
	public void fadeIn() {
		FadeTransition fade = new FadeTransition(Duration.seconds(5), imagen);
		fade.setFromValue(0);
		fade.setToValue(1);
		fade.play();
	}
}
