/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.bbdd.servicios;

import com.tfg.bbdd.cruds.IUsuario;
import com.tfg.bbdd.tablas.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author teode
 */
@Service
public class Servicios implements IServicios {

    @Autowired
    private IUsuario usuariodao;

    @Override
    public List<Usuario> listaUsuarios() {
        List<Usuario> lista = (List<Usuario>) usuariodao.findAll();
        return lista;
    }

    public Usuario busquedaporNombre(){
        Usuario user = usuariodao.findByNombre("Juan");
        return user;
    }
}
