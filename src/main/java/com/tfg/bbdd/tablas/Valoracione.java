package com.tfg.bbdd.tablas;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "valoraciones")
public class Valoracione {
    @Id
    @Column(name = "ID_valoracion", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_usuario")
    private Usuario idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_pelicula")
    private Pelicula idPelicula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_serie")
    private Series idSerie;

    @Column(name = "Valoracion")
    private Integer valoracion;

    @Convert(disableConversion = true)
    @Column(name = "Fecha_de_la_valoracion")
    private LocalDate fechaDeLaValoracion;

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

    public Integer getValoracion() {
        return valoracion;
    }

    public void setValoracion(Integer valoracion) {
        this.valoracion = valoracion;
    }

    public LocalDate getFechaDeLaValoracion() {
        return fechaDeLaValoracion;
    }

    public void setFechaDeLaValoracion(LocalDate fechaDeLaValoracion) {
        this.fechaDeLaValoracion = fechaDeLaValoracion;
    }

}