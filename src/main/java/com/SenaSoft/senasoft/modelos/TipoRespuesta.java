package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "tipoRespuesta")
public class TipoRespuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nombre;

}
