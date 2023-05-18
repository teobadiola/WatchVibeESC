package com.tfg.visual;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class FXMLMenuController {

    @javafx.fxml.FXML
    private Pane panelizq;
    @javafx.fxml.FXML
    private ImageView fondopanelizq;
    @javafx.fxml.FXML
    private ImageView logotipo;
    @javafx.fxml.FXML
    private ImageView iconouser;
    @javafx.fxml.FXML
    private Button botonPerfil;
    @javafx.fxml.FXML
    private ImageView IconoAmigos;
    @javafx.fxml.FXML
    private Button botonAmigos;
    @javafx.fxml.FXML
    private ImageView IconoAjustes;
    @javafx.fxml.FXML
    private Button botonAjustes;
    @javafx.fxml.FXML
    private ImageView iconoPeliculas;
    @javafx.fxml.FXML
    private Button BotonPeliculas;
    @javafx.fxml.FXML
    private Pane panelderecha;
    @javafx.fxml.FXML
    private ImageView fondopanelderecha;
    @javafx.fxml.FXML
    private ImageView pelicula1;
    @javafx.fxml.FXML
    private ImageView pelicula2;
    @javafx.fxml.FXML
    private ImageView pelicula3;
    @javafx.fxml.FXML
    private ImageView pelicula4;
    @javafx.fxml.FXML
    private ImageView botonmaspeliculas;
    @javafx.fxml.FXML
    private ImageView botonmasseries;
    @javafx.fxml.FXML
    private ImageView serie1;
    @javafx.fxml.FXML
    private ImageView serie2;
    @javafx.fxml.FXML
    private ImageView serie3;
    @javafx.fxml.FXML
    private ImageView serie4;
    @javafx.fxml.FXML
    private Button botonBusqueda;

    public void initialize() {

        Image IMAGENFONDOIZ = new Image(getClass().getResourceAsStream("/recursos_fondos/DEGRADADO_AZUL.png"));
        fondopanelderecha.setImage(IMAGENFONDOIZ);
        fondopanelderecha.toBack();

        Image IMAGENFONDOdr = new Image(getClass().getResourceAsStream("/recursos_fondos/naranja.png"));
        fondopanelizq.setImage(IMAGENFONDOdr);

        Image logotip = new Image(getClass().getResourceAsStream("/recursos_fondos/LOGO_COLOR.png"));
        logotipo.setImage(logotip);

        Image iconouser1 = new Image(getClass().getResourceAsStream("/iconos_pequeños/usuario2.png"));
        iconouser.setImage(iconouser1);

        Image iconoPeliculas1 = new Image(getClass().getResourceAsStream("/iconos_pequeños/busqueda_peliculas.png"));
        iconoPeliculas.setImage(iconoPeliculas1);

        Image iconoAjustes1 = new Image(getClass().getResourceAsStream("/iconos_pequeños/ajustes.png"));
        IconoAjustes.setImage(iconoAjustes1);

        Image iconoAmigos1 = new Image(getClass().getResourceAsStream("/iconos_pequeños/Amigos.png"));
        IconoAmigos.setImage(iconoAmigos1);

        Image peli1 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/jQ0gylJMxWSL490sy0RrPj1Lj7e.jpg"));
        pelicula1.setImage(peli1);

        Image peli2 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/mZ4gBdfkhP9tvLH1DO4m4HYtiyi.jpg"));
        pelicula2.setImage(peli2);

        Image peli3 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/q719jXXEzOoYaps6babgKnONONX.jpg"));
        pelicula3.setImage(peli3);

        Image peli4 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/eCOtqtfvn7mxGl6nfmq4b1exJRc.jpg"));
        pelicula4.setImage(peli4);

        Image series1 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/jQ0gylJMxWSL490sy0RrPj1Lj7e.jpg"));
        serie1.setImage(series1);

        Image series2 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/mZ4gBdfkhP9tvLH1DO4m4HYtiyi.jpg"));
        serie2.setImage(series2);

        Image series3 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/q719jXXEzOoYaps6babgKnONONX.jpg"));
        serie3.setImage(series3);

        Image series4 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/eCOtqtfvn7mxGl6nfmq4b1exJRc.jpg"));
        serie4.setImage(series4);



    }

    @javafx.fxml.FXML
    public void onHandlPerfil(ActionEvent actionEvent) {
        try {
            // Cargar el archivo FXML "perfil.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLPerfil.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena con el archivo FXML cargado
            Scene scene = new Scene(root);

            // Obtener la ventana actual a través del evento
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Establecer la escena en la ventana
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void onHandleAmigos(ActionEvent actionEvent) {
        /*
        try {
            // Cargar el archivo FXML "perfil.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLAmigos.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena con el archivo FXML cargado
            Scene scene = new Scene(root);

            // Obtener la ventana actual a través del evento
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Establecer la escena en la ventana
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

    }

    @javafx.fxml.FXML
    public void onHandleAjustes(ActionEvent actionEvent) {
               /*
        try {
            // Cargar el archivo FXML "perfil.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLAjustes.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena con el archivo FXML cargado
            Scene scene = new Scene(root);

            // Obtener la ventana actual a través del evento
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Establecer la escena en la ventana
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    @javafx.fxml.FXML
    public void onHandleCatalogo(ActionEvent actionEvent) {
               /*
        try {
            // Cargar el archivo FXML "perfil.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLCatalogo.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena con el archivo FXML cargado
            Scene scene = new Scene(root);

            // Obtener la ventana actual a través del evento
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Establecer la escena en la ventana
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    @javafx.fxml.FXML
    public void onMouseClicked(Event event) {
        try {
            // Cargar el archivo FXML "perfil.fxml"
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXMLFicha.fxml"));
            Parent root = loader.load();

            // Crear una nueva escena con el archivo FXML cargado
            Scene scene = new Scene(root);

            // Obtener la ventana actual a través del evento
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Establecer la escena en la ventana
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}