package com.tfg.wvfx;

import com.tfg.bbdd.servicios.IServicios;
import com.tfg.bbdd.servicios.Servicios;
import com.tfg.bbdd.tablas.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;

@SpringBootApplication
public class WVfxApplication {

	@Autowired
    public Servicios servicios;

	public static void main(String[] args) {

        SpringApplication.run(WVfxApplication.class, args);
	}

	@EventListener({ApplicationReadyEvent.class})
    public void pruebaConsultas() {
        Usuario user = servicios.busquedaporNombre();
        System.out.println(user.toString());
    }}