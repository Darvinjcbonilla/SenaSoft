package com.SenaSoft.senasoft.modelos;


import javax.persistence.*;

@Entity
@Table(name = "tipoDocumento")
public class tipoDocumento {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String tipoDocumento;

    //Constructor

    public tipoDocumento() {
    }

    public tipoDocumento(int id, String tipoDocumento) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
    }

    //Set y get


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
