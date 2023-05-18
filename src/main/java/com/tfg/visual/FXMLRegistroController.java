package com.tfg.visual;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class FXMLRegistroController {
    @FXML
    private ImageView imagen1;
    @FXML
    private ImageView imagen2;
    @FXML
    private ImageView imagen3;
    @FXML
    private ImageView imagen4;
    @FXML
    private ImageView imagen6;
    @FXML
    private ImageView imagen7;
    @FXML
    private ImageView imagen8;
    @FXML
    private ImageView imagen9;
    @FXML
    private ImageView imagen10;
    @FXML
    private ImageView imagen11;
    @FXML
    private ImageView imagen12;
    @FXML
    private ImageView imagen13;
    @FXML
    private ImageView imagen14;
    @FXML
    private ImageView imagen15;
    @FXML
    private ImageView imagen16;
    @FXML
    private ImageView logotipo;
    @FXML
    private ImageView fondo;
    @FXML
    private ImageView imagen17;
    @FXML
    private ImageView imagen18;
    @FXML
    private ImageView imagen5;
    @FXML
    private Pane panelprincipal;


    public void initialize() {

        panelprincipal.toFront();

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image = new Image(getClass().getResourceAsStream("/icono/logopng.png"));
        logotipo.setImage(image);

        Image backgroundImage = new Image(getClass().getResourceAsStream("/recursos_fondos/naranja.png"));
        fondo.setImage(backgroundImage);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image1 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/Sonic_2_La_pel_cula-126622695-large.jpg"));
        imagen1.setImage(image1);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image2 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/3Gkb6jm6962ADUPaCBqzz9CTbn9.jpg"));
        imagen2.setImage(image2);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image3 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/eCOtqtfvn7mxGl6nfmq4b1exJRc.jpg"));
        imagen3.setImage(image3);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image4 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/q719jXXEzOoYaps6babgKnONONX.jpg"));
        imagen4.setImage(image4);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image5 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/5bqwnvdmxYA55FFMc95oNvlAoYk.jpg"));
        imagen5.setImage(image5);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image6 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/9050VGrYjYrEjpOvDZVAngLbg1f.jpg"));
        imagen6.setImage(image6);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image7 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/dm06L9pxDOL9jNSK4Cb6y139rrG.jpg"));
        imagen7.setImage(image7);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image8 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/El_gato_con_botas_El_ltimo_deseo-632107416-large.jpg"));
        imagen8.setImage(image8);


        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image9 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/Every-thing-cartel.jpg"));
        imagen9.setImage(image9);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image10 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/mdLDgQBD0va09npSQX5Zgo2evXM.jpg"));
        imagen10.setImage(image10);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image11 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/mZ4gBdfkhP9tvLH1DO4m4HYtiyi.jpg"));
        imagen11.setImage(image11);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image12 = new Image(getClass().getResourceAsStream("/caratulas_series/c4mk4EQVIM11yd3W43DDdqDazDU.jpg"));
        imagen12.setImage(image12);



        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image13 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/El_gato_con_botas_El_ltimo_deseo-632107416-large.jpg"));
        imagen13.setImage(image13);


        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image14 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/Every-thing-cartel.jpg"));
        imagen14.setImage(image14);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image15 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/mdLDgQBD0va09npSQX5Zgo2evXM.jpg"));
        imagen15.setImage(image15);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image16 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/mZ4gBdfkhP9tvLH1DO4m4HYtiyi.jpg"));
        imagen16.setImage(image16);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image17 = new Image(getClass().getResourceAsStream("/caratulas_series/0441DO_4.jpg"));
        imagen17.setImage(image17);

        /**
         * Asignacion de Logo a la pantalla Inicial
         */
        Image image18 = new Image(getClass().getResourceAsStream("/caratulas_peliculas/jQ0gylJMxWSL490sy0RrPj1Lj7e.jpg"));
        imagen18.setImage(image18);

    }
}
