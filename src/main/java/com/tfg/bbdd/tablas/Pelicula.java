package com.tfg.bbdd.tablas;

import jakarta.persistence.*;

@Entity
@Table(name = "peliculas")
public class Pelicula {
    @Id
    @Column(name = "ID_Pelicula", nullable = false)
    private Integer id;

    @Column(name = "Titulo", length = 100)
    private String titulo;

    @Column(name = "Director", length = 100)
    private String director;

    @Column(name = "Anio")
    private Integer anio;

    @Column(name = "Genero", length = 50)
    private String genero;

    @Lob
    @Column(name = "Sinopsis")
    private String sinopsis;

    @Column(name = "Foto_de_Portada", length = 100)
    private String fotoDePortada;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getFotoDePortada() {
        return fotoDePortada;
    }

    public void setFotoDePortada(String fotoDePortada) {
        this.fotoDePortada = fotoDePortada;
    }

}