package com.tfg.bbdd.cruds;

import com.tfg.bbdd.tablas.CatalogoSery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICat_Sery extends CrudRepository <CatalogoSery, Integer>{

    public CatalogoSery findByNombre(String nombre);
}
