package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "usuRol")
public class UsuRol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int idUsuRol;

    @ManyToOne
    @JoinColumn(name = "ciudadano_id")
    private com.SenaSoft.senasoft.modelos.Ciudadano Ciudadano;
    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public com.SenaSoft.senasoft.modelos.Ciudadano getCiudadano() {
        return Ciudadano;
    }

    public void setCiudadano(com.SenaSoft.senasoft.modelos.Ciudadano Ciudadano) {
        this.Ciudadano = Ciudadano;
    }


}
