package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "regimenAfiliado")
public class regimenAfiliado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String tipoRegimen;
}
