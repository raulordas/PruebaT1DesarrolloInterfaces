package application;

import com.jfoenix.controls.JFXButton;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 * Clase controladora que contiene la lógica de negocio correspondiente
 * a la interfaz gráfica de la ventana secundaria de la aplicación
 * @author RAÚL ORDÁS FERNÁNDEZ
 * @version 1.0
 *
 */
public class ControlVentana2 {
	@FXML
	private AnchorPane ventanaSecundaria, panelMenu;
	
	@FXML
	private JFXButton botonReservar;
	
	private boolean extraer;
	
	public void initialize() {
		eliminarPanelMenu();
		extraer = true;
	}
	
	/**
	 * Metodo void que elimina el paneldel Menu realizando una transición a la izquierda
	 * @return no tiene retorno
	 */
	public void eliminarPanelMenu() {
		TranslateTransition eliminar = new TranslateTransition(Duration.seconds(0.2), panelMenu);
		eliminar.setByX(-600);
		eliminar.play();
	}
	
	/**
	 * Metodo void que comprueba el estado del panel del menu a través de un booleano.
	 * En función de su valor, realiza extrae o introduce el panel del menu.
	 * @return no tiene retorno
	 */
	public void visualizarPanelMenu() {
		if (!extraer) {
			eliminarPanelMenu();
			extraer = true;
			
		} else {
			TranslateTransition visualizar = new TranslateTransition(Duration.seconds(1), panelMenu);
			visualizar.setByX(600);
			visualizar.play();
			extraer = false;
			}
	}
	
	public void hover() {
		botonReservar.setStyle("-fx-background-color: black");
	}
	
	
	/**
	 * Metodo void que al hacer release del botón aceptar, cambia el background a color azul
	 * @return no tiene retorno
	 */
	public void unHover() {
		botonReservar.setStyle("-fx-background-color: #75B4BB");
	}
	
	/**
	 * Metodo void que al hacer click en el botón salir ejecuta el system.exit(0)
	 * @return no tiene retorno
	 */
	public void salir() {
		System.exit(0);
	}
}	
