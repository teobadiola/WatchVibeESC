package com.tfg.bbdd.tablas;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "catalogo_series")
public class CatalogoSery {
    @Id
    @Column(name = "ID_Cat", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_usuario")
    private Usuario idUsuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_serie")
    private Series idSerie;

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

    public Series getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Series idSerie) {
        this.idSerie = idSerie;
    }

    public LocalDate getFechaDeAnadido() {
        return fechaDeAnadido;
    }

    public void setFechaDeAnadido(LocalDate fechaDeAnadido) {
        this.fechaDeAnadido = fechaDeAnadido;
    }

}