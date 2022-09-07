package com.SenaSoft.senasoft.repositorios;

import com.SenaSoft.senasoft.modelos.Ciudadano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadanoRepository extends JpaRepository<Ciudadano, Integer> {
}
