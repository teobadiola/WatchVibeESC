package com.tfg.bbdd.cruds;

import com.tfg.bbdd.tablas.CatalogoSery;
import com.tfg.bbdd.tablas.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuario extends CrudRepository <Usuario, Integer>{
    public Usuario findByNombre(String nombre);
}
