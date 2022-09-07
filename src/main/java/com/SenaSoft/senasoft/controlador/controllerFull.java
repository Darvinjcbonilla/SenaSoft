package com.SenaSoft.senasoft.controlador;

import com.SenaSoft.senasoft.modelos.Ciudadano;
import com.SenaSoft.senasoft.service.CiudadanoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@RestController
public class controllerFull {
    //Ciudadano
    @Autowired
    CiudadanoService ciudadanoService;

    @GetMapping({"/","ciudadanos"})
    public List<Ciudadano> viewCiudadanos(Model model, @ModelAttribute("mensaje") String mensaje){
        return ciudadanoService.getAllCiudadanos();
    }

    @PostMapping("/Registrar")
    public String newCiudadano(Model model, @ModelAttribute("mensaje") String mensaje){
        Ciudadano ciudadano =new Ciudadano();
        model.addAttribute("ciudadano", ciudadano);
        model.addAttribute("mensaje", mensaje);
        return "registrar";
    }


    @PatchMapping("ActualizarCiudadanos")
    public String saveCiudadano(Ciudadano ciudadano, RedirectAttributes redirectAttributes){
        if (ciudadanoService.saveOrUpdateCiuddano(ciudadano)){
            redirectAttributes.addAttribute("mensaje", "saveOk");
            return "redirect:/verCiudadanos";
        }
        redirectAttributes.addAttribute("mensaje", "saveError");
        return "redirect:/ActualizarCiudadano";
    }

}
