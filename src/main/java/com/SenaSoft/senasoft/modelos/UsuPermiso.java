package com.SenaSoft.senasoft.modelos;

import javax.persistence.*;

@Entity
@Table(name = "usuPermiso")
public class UsuPermiso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    @ManyToOne
    @JoinColumn(name = "usua_rol_id_usu_rol")
    private UsuRol usuaRol;
    @ManyToOne
    @JoinColumn(name = "permiso_id")
    private Permisos permiso;

    public Permisos getPermiso() {
        return permiso;
    }

    public void setPermiso(Permisos permiso) {
        this.permiso = permiso;
    }

    public UsuRol getUsuaRol() {
        return usuaRol;
    }

    public void setUsuaRol(UsuRol usuaRol) {
        this.usuaRol = usuaRol;
    }
}
