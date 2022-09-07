package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "permisos")
public class Permisos {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nombrePerm;

    //Constructor

    public Permisos() {
    }

    public Permisos(int id, String nombrePerm) {
        this.id = id;
        this.nombrePerm = nombrePerm;
    }

    //set get


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePerm() {
        return nombrePerm;
    }

    public void setNombrePerm(String nombrePerm) {
        this.nombrePerm = nombrePerm;
    }
}
