package com.tfg.wvfx;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan("com.tfg.bbdd.servicios")
@ComponentScan("com.tfg.bbdd.cruds")
@ComponentScan("com.tfg.bbdd.operaciones")
@ComponentScan("com.tfg.bbdd.tablas")
@ComponentScan("com.tfg.bbdd.cruds")

public class ConfiguracionSpring {

}
