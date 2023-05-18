package com.tfg.bbdd.cruds;

import com.tfg.bbdd.tablas.CatalogoPelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICat_peliculas extends CrudRepository <CatalogoPelicula, Integer>{

    public CatalogoPelicula findByNombre(String nombre);
}
