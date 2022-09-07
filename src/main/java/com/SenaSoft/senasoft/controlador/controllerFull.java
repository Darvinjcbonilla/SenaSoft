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
    public String viewCiudadanos(Model model, @ModelAttribute("mensaje") String mensaje){
        List<Ciudadano> ciudadanoList = ciudadanoService.getAllCiudadanos();
        model.addAttribute("listaCiudadanos", ciudadanoList);
        model.addAttribute("mensaje", mensaje);
        return "verCiudadanos";
    }

    @GetMapping("/AgregarCiudadno")
    public String newCiudadano(Model model, @ModelAttribute("mensaje") String mensaje){
        Ciudadano ciudadano =new Ciudadano();
        model.addAttribute("ciudadano", ciudadano);
        model.addAttribute("mensaje", mensaje);
        return "agregarCiudadano";
    }


    @PostMapping("GuardarCiudadanos")
    public String saveEmpresa(Ciudadano ciudadano, RedirectAttributes redirectAttributes){
        if (ciudadanoService.saveOrUpdateCiuddano(ciudadano)){
            redirectAttributes.addAttribute("mensaje", "saveOk");
            return "redirect:/verCiudadanos";
        }
        redirectAttributes.addAttribute("mensaje", "saveError");
        return "redirect:/AgregarCiudadano";
    }

}
