package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "dispositivosTec")
public class dispositivosTec {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String tipo;
}
