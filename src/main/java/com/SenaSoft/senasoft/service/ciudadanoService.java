package com.SenaSoft.senasoft.service;

import com.SenaSoft.senasoft.repositorios.CiudadanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ciudadanoService {
    @Autowired
    CiudadanoRepository ciudadanoRepository;
    //Servicios de ciudadanos
    //Servicio de consultar los diferentes sondeos de opinion, dependiendo el perfin del ciudadano

}
