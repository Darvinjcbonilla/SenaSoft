package com.SenaSoft.senasoft.controladores;

import com.SenaSoft.senasoft.modelos.Ciudadano;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @GetMapping("/participacion")
    public Ciudadano mostrarCiudadano(){
        Ciudadano ciudadano =
    }

    @PostMapping("/participacion")
    public Ciudadano registrarCiudadano(){

    }
}
