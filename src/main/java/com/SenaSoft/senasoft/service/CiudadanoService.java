package com.SenaSoft.senasoft.service;

import com.SenaSoft.senasoft.modelos.Ciudadano;
import com.SenaSoft.senasoft.modelos.Sondeo;
import com.SenaSoft.senasoft.repositorios.CiudadanoRepository;
import com.SenaSoft.senasoft.repositorios.SondeoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadanoService {
    @Autowired
    CiudadanoRepository ciudadanoRepository;
    //Servicios de ciudadanos
    //Metodo que me muestra un listado de los ciudadanos registrados
    public List<Ciudadano> getAllCiudadanos(){
        List<Ciudadano> ciudadanoList = new ArrayList<>();
        ciudadanoRepository.findAll().forEach(Ciudadano -> ciudadanoList.add(Ciudadano));
        return ciudadanoList;
    }


   //Metodo que me muestra un ciudadano en especifico por id
    public Ciudadano getCiudadanoById(Integer id) {
        return ciudadanoRepository.findById(id).get();
    }

    //Metodo para actualizar objetos de ciudadanos
    public Ciudadano saveOrUpdateCiudadano(Ciudadano ciudadano){
        return ciudadanoRepository.save(ciudadano);
    }
}
