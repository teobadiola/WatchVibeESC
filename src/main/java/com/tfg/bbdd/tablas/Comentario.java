package com.tfg.bbdd.tablas;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "comentarios")
public class Comentario {
    @Id
    @Column(name = "ID_Coment", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Usuario")
    private Usuario idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Pelicula")
    private Pelicula idPelicula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Serie")
    private Series idSerie;

    @Lob
    @Column(name = "Contenido_del_comentario")
    private String contenidoDelComentario;

    @Convert(disableConversion = true)
    @Column(name = "Fecha_de_publicacion")
    private LocalDate fechaDePublicacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Pelicula getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Pelicula idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Series getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Series idSerie) {
        this.idSerie = idSerie;
    }

    public String getContenidoDelComentario() {
        return contenidoDelComentario;
    }

    public void setContenidoDelComentario(String contenidoDelComentario) {
        this.contenidoDelComentario = contenidoDelComentario;
    }

    public LocalDate getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

}