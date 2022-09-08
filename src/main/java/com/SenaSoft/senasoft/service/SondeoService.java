package com.SenaSoft.senasoft.service;

import com.SenaSoft.senasoft.modelos.Sondeo;
import com.SenaSoft.senasoft.repositorios.SondeoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SondeoService {
    @Autowired
    SondeoRepository sondeoRepository;

    //Metodo para buscar Sondeo por ciudadano
    public ArrayList<Sondeo> obtenetPorCiudadano(Integer id){
        return sondeoRepository.findByCiudadano(id);
    }
}
