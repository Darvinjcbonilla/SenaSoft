package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nombreRol;


    //Constructor

    public Rol() {
    }

    public Rol(int id, String nombreRol) {
        this.id = id;
        this.nombreRol = nombreRol;
    }

    //set y get


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}
