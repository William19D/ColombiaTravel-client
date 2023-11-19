package co.edu.uniquindio.agencia.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerInicio {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private AnchorPane ventana;


    @FXML
    void iniciarSesionEvent(ActionEvent event) throws IOException {
        new ViewController(ventana, "/ventanas/inicioSesion.fxml");

    }

    @FXML
    void registroEvent(ActionEvent event) throws IOException {
        new ViewController(ventana, "/ventanas/ventanaRegistroCliente.fxml");

    }

    @FXML
    void initialize() {

    }

}
