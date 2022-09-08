package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sondeo")
public class Sondeo {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String titulo;
    private String pregunta;
    @ManyToOne
    @JoinColumn(name = "respuesta_id")
    private TipoRespuesta respuesta;
    private Date fecha;

    //Constructor

    public Sondeo() {
    }

    public Sondeo(int id, String titulo, String pregunta, TipoRespuesta respuesta, Date fecha) {
        this.id = id;
        this.titulo = titulo;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.fecha = fecha;
    }

    //set y get


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public TipoRespuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(TipoRespuesta respuesta) {
        this.respuesta = respuesta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
