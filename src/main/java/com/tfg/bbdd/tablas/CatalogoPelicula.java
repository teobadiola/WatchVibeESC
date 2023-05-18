package com.tfg.bbdd.tablas;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "catalogo_peliculas")
public class CatalogoPelicula {
    @Id
    @Column(name = "ID_Cat", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_usuario")
    private Usuario idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_pelicula")
    private Pelicula idPelicula;

    @Convert(disableConversion = true)
    @Column(name = "Fecha_de_anadido")
    private LocalDate fechaDeAnadido;

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

    public LocalDate getFechaDeAnadido() {
        return fechaDeAnadido;
    }

    public void setFechaDeAnadido(LocalDate fechaDeAnadido) {
        this.fechaDeAnadido = fechaDeAnadido;
    }

}