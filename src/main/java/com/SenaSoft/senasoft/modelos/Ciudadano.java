package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "ciudadano")
public class Ciudadano {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    String cedula;
    String nombres;
    String apellidos;
    String sexo;
    String telefonoCel;
    String telefonoFijo;
    String correoElec;
    String municipio;
    String direccion;
    String barrioVereda;
    String fNacimiento;
    String etnia;
    String cDiscapacidad;
    String estratoResid;
    String uNEeducativo;
    boolean accesoDispTec;
    String dispositivosTec;
    boolean conectivInternet;
    String regimenAfiliado;


    //Constructor

    public Ciudadano() {
    }

    public Ciudadano(int id, String cedula, String nombres, String apellidos, String sexo, String telefonoCel, String telefonoFijo, String correoElec, String municipio, String direccion, String barrioVereda, String fNacimiento, String etnia, String cDiscapacidad, String estratoResid, String uNEeducativo, boolean accesoDispTec, String dispositivosTec, boolean conectivInternet, String regimenAfiliado) {
        this.id = id;
        this.cedula = cedula;
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
        this.dispositivosTec = dispositivosTec;
        this.conectivInternet = conectivInternet;
        this.regimenAfiliado = regimenAfiliado;
    }
    //Set y get


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(String fNacimiento) {
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

    public String getEstratoResid() {
        return estratoResid;
    }

    public void setEstratoResid(String estratoResid) {
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

    public String getDispositivosTec() {
        return dispositivosTec;
    }

    public void setDispositivosTec(String dispositivosTec) {
        this.dispositivosTec = dispositivosTec;
    }

    public boolean isConectivInternet() {
        return conectivInternet;
    }

    public void setConectivInternet(boolean conectivInternet) {
        this.conectivInternet = conectivInternet;
    }

    public String getRegimenAfiliado() {
        return regimenAfiliado;
    }

    public void setRegimenAfiliado(String regimenAfiliado) {
        this.regimenAfiliado = regimenAfiliado;
    }
}
