package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "sexo")
public class sexo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String genero;

    //Constructor


    public sexo() {
    }

    public sexo(int id, String genero) {
        this.id = id;
        this.genero = genero;
    }

    //Set y get

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
