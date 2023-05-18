package com.tfg.bbdd.tablas;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "seguimiento_usuarios")
public class SeguimientoUsuario {
    @Id
    @Column(name = "ID_seguimiento", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Usuario_Seguidor")
    private Usuario idUsuarioSeguidor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_Usuario_Seguido")
    private Usuario idUsuarioSeguido;

    @Convert(disableConversion = true)
    @Column(name = "Fecha_de_seguimiento")
    private LocalDate fechaDeSeguimiento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getIdUsuarioSeguidor() {
        return idUsuarioSeguidor;
    }

    public void setIdUsuarioSeguidor(Usuario idUsuarioSeguidor) {
        this.idUsuarioSeguidor = idUsuarioSeguidor;
    }

    public Usuario getIdUsuarioSeguido() {
        return idUsuarioSeguido;
    }

    public void setIdUsuarioSeguido(Usuario idUsuarioSeguido) {
        this.idUsuarioSeguido = idUsuarioSeguido;
    }

    public LocalDate getFechaDeSeguimiento() {
        return fechaDeSeguimiento;
    }

    public void setFechaDeSeguimiento(LocalDate fechaDeSeguimiento) {
        this.fechaDeSeguimiento = fechaDeSeguimiento;
    }

}