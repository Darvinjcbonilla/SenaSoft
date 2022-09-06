package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "ciudadano")
public class ciudadano {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @ManyToOne
    @JoinColumn(name = "tipoDocumento_id")
    tipoDocumento idTipoDoc;
    String nombres;
    String apellidos;
    @ManyToOne
    @JoinColumn(name = "sexo_id")
    private sexo sexo;
    String telefonoCel;
    String telefonoFijo;
    String correoElec;
    String municipio;
    String direccion;
    String brrioVereda;
    String fNacimiento;
    String etnia;
    String cDiscapacidad;
    int estratoResid;
    String uNEeducativo;
    boolean accesoDispTec;
    int id_cual_cuales;
    boolean conectivInternet;
    int id_tipo_reg_afiliado;

    //Constructor




    //Set y get


}
