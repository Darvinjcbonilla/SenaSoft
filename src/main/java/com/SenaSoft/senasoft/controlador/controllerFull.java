package com.SenaSoft.senasoft.controlador;

import com.SenaSoft.senasoft.modelos.Ciudadano;
import com.SenaSoft.senasoft.modelos.Sondeo;
import com.SenaSoft.senasoft.service.CiudadanoService;
import com.SenaSoft.senasoft.service.SondeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controllerFull {
    //Ciudadano
    @Autowired
    CiudadanoService ciudadanoService;

    @GetMapping(path = "/ciudadanos/{id}")
    public Ciudadano ciudadanoPorId(@PathVariable("id") Integer id) {
        return ciudadanoService.getCiudadanoById(id);
    }

    @PostMapping("AgregarCiudadano")
    public Ciudadano guardarCiudadano(@RequestBody Ciudadano ciud) {
        return this.ciudadanoService.saveOrUpdateCiudadano(ciud);
    }

    @PatchMapping("editarDatos/{id}")
    public Ciudadano editCiudadano(@PathVariable("id") Integer id, @RequestBody Ciudadano ciudadano) {
        Ciudadano ciud = ciudadanoService.getCiudadanoById(id);
        ciud.setTipoDoc(ciudadano.getTipoDoc());
        ciud.setNumDoc(ciudadano.getNumDoc());
        ciud.setNombres(ciudadano.getNombres());
        ciud.setApellidos(ciudadano.getApellidos());
        ciud.setSexo(ciudadano.getSexo());
        ciud.setTelefonoCel(ciudadano.getTelefonoCel());
        ciud.setTelefonoFijo(ciudadano.getTelefonoFijo());
        ciud.setCorreoElec(ciudadano.getCorreoElec());
        ciud.setMunicipio(ciudadano.getMunicipio());
        ciud.setDireccion(ciudadano.getDireccion());
        ciud.setBarrioVereda(ciudadano.getBarrioVereda());
        ciud.setfNacimiento(ciudadano.getfNacimiento());
        ciud.setEtnia(ciudadano.getEtnia());
        ciud.setcDiscapacidad(ciudadano.getcDiscapacidad());
        ciud.setEstratoResid(ciudadano.getEstratoResid());
        ciud.setuNEeducativo(ciudadano.getuNEeducativo());
        ciud.setAccesoDispTec(ciudadano.isAccesoDispTec());
        ciud.setId_cual_cuales(ciudadano.getId_cual_cuales());
        ciud.setConectivInternet(ciudadano.isConectivInternet());
        ciud.setId_tipo_reg_afiliado(ciudadano.getId_tipo_reg_afiliado());

        return ciudadanoService.saveOrUpdateCiudadano(ciud);
    }


    @Autowired
    SondeoService sondeoService;

    @GetMapping("sondeo/{id}/ciudadano")
    public ArrayList<Sondeo> sondeoPorCiudadano(@PathVariable("id") Integer id) {
        return this.sondeoService.obtenetPorCiudadano(id);
    }
}



