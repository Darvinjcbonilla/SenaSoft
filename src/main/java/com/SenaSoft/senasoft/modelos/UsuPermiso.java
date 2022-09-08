package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "usuPermiso")
public class UsuPermiso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;
    @ManyToOne
    @JoinColumn(name = "sondeo_id")
    private Sondeo sondeo;
    @ManyToOne
    @JoinColumn(name = "ciudadano_id")
    private Ciudadano ciudadano;

    //Constructor
    public UsuPermiso() {
    }

    public UsuPermiso(int id, String nombre, Rol rol, Sondeo sondeo, Ciudadano ciudadano) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.sondeo = sondeo;
        this.ciudadano = ciudadano;
    }

    //Set y get

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public Sondeo getSondeo() {
        return sondeo;
    }

    public void setSondeo(Sondeo sondeo) {
        this.sondeo = sondeo;
    }


    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
