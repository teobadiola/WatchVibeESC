package com.tfg.visual;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FXMLFichaController {
    @FXML
    public ImageView fondo;
    @FXML
    public ImageView portada;

    public void initialize(){
        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image backg = new Image(getClass().getResourceAsStream("/recursos_fondos/naranja.png"));
        fondo.setImage(backg);


        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image portada1 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/Every-thing-cartel.jpg"));
        portada.setImage(portada1);


    }


}
