/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.bbdd.servicios;



import com.tfg.bbdd.tablas.Usuario;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 *
 * @author teode
 */

public interface IServicios {

    /**
     * Lista de Usuarios en la base de datos
     *
     * @return Usuario
     */


    public List<Usuario> listaUsuarios();


}
