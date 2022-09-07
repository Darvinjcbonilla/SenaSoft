package com.SenaSoft.senasoft.controlador;

import com.SenaSoft.senasoft.modelos.Ciudadano;
import com.SenaSoft.senasoft.service.CiudadanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class controllerFull {
    //Ciudadano
    @Autowired
    CiudadanoService ciudadanoService;

    @GetMapping({"/","ciudadanos"})
    public String viewCiudadanos(){
        ciudadanoService.getAllCiudadanos();
        return "index";
    }

    @PostMapping(value = "AgregarCiudadno")
    public String newCiudadano(Model model, @ModelAttribute("mensaje") String mensaje){
        Ciudadano ciudadano =new Ciudadano();
        model.addAttribute("ciudadano", ciudadano);
        model.addAttribute("mensaje", mensaje);
        return "agregarCiudadano";
    }


    @PatchMapping("editarDatos")
    public String editCiudadano(Ciudadano ciudadano, RedirectAttributes redirectAttributes){
        ciudadano.setTipoDoc(ciudadano.getTipoDoc());
        ciudadano.setCedula(ciudadano.getCedula());
        ciudadano.setNombres(ciudadano.getNombres());
        ciudadano.setApellidos(ciudadano.getApellidos());
        ciudadano.setSexo(ciudadano.getSexo());
        ciudadano.setTelefonoCel(ciudadano.getTelefonoCel());
        ciudadano.setTelefonoFijo(ciudadano.getTelefonoFijo());
        ciudadano.setCorreoElec(ciudadano.getCorreoElec());
        ciudadano.setMunicipio(ciudadano.getMunicipio());
        ciudadano.setDireccion(ciudadano.getDireccion());
        ciudadano.setBarrioVereda(ciudadano.getBarrioVereda());
        ciudadano.setfNacimiento(ciudadano.getfNacimiento());
        ciudadano.setEtnia(ciudadano.getEtnia());
        ciudadano.setcDiscapacidad(ciudadano.getcDiscapacidad());
        ciudadano.setEstratoResid(ciudadano.getEstratoResid());
        ciudadano.setuNEeducativo(ciudadano.getuNEeducativo());
        ciudadano.setAccesoDispTec(ciudadano.isAccesoDispTec());
        ciudadano.setId_cual_cuales(ciudadano.getId_cual_cuales());
        ciudadano.setConectivInternet(ciudadano.isConectivInternet());
        ciudadano.setId_tipo_reg_afiliado(ciudadano.getId_tipo_reg_afiliado());
        if (ciudadanoService.saveOrUpdateCiuddano(ciudadano)){
            redirectAttributes.addAttribute("mensaje", "saveOk");
            return "redirect:/verCiudadanos";
        }
        redirectAttributes.addAttribute("mensaje", "saveError");
        return "redirect:/editarDatos";
    }

}
