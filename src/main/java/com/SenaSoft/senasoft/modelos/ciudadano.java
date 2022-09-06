package com.SenaSoft.senasoft.modelos;

import javax.persistence.Table;

@Table(name = "ciudadano")
public class ciudadano {

    //Atributos
    int id;
    int id_tipo_doc;
    String nombres;
    String apellidos;
    int sexo;

}
