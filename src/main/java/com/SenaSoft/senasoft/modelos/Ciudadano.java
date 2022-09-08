package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ciudadano")
public class Ciudadano {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String tipoDoc;
    private String numDoc;
    private String nombres;
    private String apellidos;
    private String sexo;
    private String telefonoCel;
    private String telefonoFijo;
    private String correoElec;
    private String municipio;
    private String direccion;
    private String barrioVereda;
    private java.sql.Date fNacimiento;
    private String etnia;
    private String cDiscapacidad;
    private int estratoResid;
    private String uNEeducativo;
    private boolean accesoDispTec;
    private int id_cual_cuales;
    private boolean conectivInternet;
    private int id_tipo_reg_afiliado;

    //Constructor

    public Ciudadano() {
    }

    public Ciudadano(int id, String tipoDoc, String numDoc, String nombres, String apellidos, String sexo, String telefonoCel, String telefonoFijo, String correoElec, String municipio, String direccion, String barrioVereda, Date fNacimiento, String etnia, String cDiscapacidad, int estratoResid, String uNEeducativo, boolean accesoDispTec, int id_cual_cuales, boolean conectivInternet, int id_tipo_reg_afiliado) {
        this.id = id;
        this.tipoDoc = tipoDoc;
        this.numDoc = numDoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.telefonoCel = telefonoCel;
        this.telefonoFijo = telefonoFijo;
        this.correoElec = correoElec;
        this.municipio = municipio;
        this.direccion = direccion;
        this.barrioVereda = barrioVereda;
        this.fNacimiento = fNacimiento;
        this.etnia = etnia;
        this.cDiscapacidad = cDiscapacidad;
        this.estratoResid = estratoResid;
        this.uNEeducativo = uNEeducativo;
        this.accesoDispTec = accesoDispTec;
        this.id_cual_cuales = id_cual_cuales;
        this.conectivInternet = conectivInternet;
        this.id_tipo_reg_afiliado = id_tipo_reg_afiliado;
    }

    //Set y get


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefonoCel() {
        return telefonoCel;
    }

    public void setTelefonoCel(String telefonoCel) {
        this.telefonoCel = telefonoCel;
    }

    public String getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(String telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public String getCorreoElec() {
        return correoElec;
    }

    public void setCorreoElec(String correoElec) {
        this.correoElec = correoElec;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrioVereda() {
        return barrioVereda;
    }

    public void setBarrioVereda(String barrioVereda) {
        this.barrioVereda = barrioVereda;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }

    public String getcDiscapacidad() {
        return cDiscapacidad;
    }

    public void setcDiscapacidad(String cDiscapacidad) {
        this.cDiscapacidad = cDiscapacidad;
    }

    public int getEstratoResid() {
        return estratoResid;
    }

    public void setEstratoResid(int estratoResid) {
        this.estratoResid = estratoResid;
    }

    public String getuNEeducativo() {
        return uNEeducativo;
    }

    public void setuNEeducativo(String uNEeducativo) {
        this.uNEeducativo = uNEeducativo;
    }

    public boolean isAccesoDispTec() {
        return accesoDispTec;
    }

    public void setAccesoDispTec(boolean accesoDispTec) {
        this.accesoDispTec = accesoDispTec;
    }

    public int getId_cual_cuales() {
        return id_cual_cuales;
    }

    public void setId_cual_cuales(int id_cual_cuales) {
        this.id_cual_cuales = id_cual_cuales;
    }

    public boolean isConectivInternet() {
        return conectivInternet;
    }

    public void setConectivInternet(boolean conectivInternet) {
        this.conectivInternet = conectivInternet;
    }

    public int getId_tipo_reg_afiliado() {
        return id_tipo_reg_afiliado;
    }

    public void setId_tipo_reg_afiliado(int id_tipo_reg_afiliado) {
        this.id_tipo_reg_afiliado = id_tipo_reg_afiliado;
    }
}
