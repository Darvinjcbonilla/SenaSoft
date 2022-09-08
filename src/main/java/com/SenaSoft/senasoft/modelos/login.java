package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class login {
    @Id
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Ciudadano usuario;








    public Ciudadano getUsuario() {
        return usuario;
    }

    public void setUsuario(Ciudadano usuario) {
        this.usuario = usuario;
    }





}
