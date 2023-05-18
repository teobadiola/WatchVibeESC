module WVfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires MaterialFX;
    requires jakarta.persistence;
    requires spring.data.commons;

    exports com.tfg.visual;
    exports com.tfg.wvfx;
    exports com.tfg.bbdd.servicios;
    exports com.tfg.bbdd.cruds;
    exports com.tfg.bbdd.tablas;


    opens com.tfg.wvfx;
    opens com.tfg.bbdd.servicios;
    opens com.tfg.visual to
            javafx.fxml, MaterialFX, javafx.graphics, javafx.controls;

}