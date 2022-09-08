package com.SenaSoft.senasoft.repositorios;

import com.SenaSoft.senasoft.modelos.Sondeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface SondeoRepository extends JpaRepository<Sondeo, Integer> {
    @Query(value = "SELECT sondeo.id, usu_permiso.id, ciudadano.id FROM sondeo, ciudadano INNER JOIN usu_permiso ON ciudadano.id = usu_permiso.sondeo_id WHERE (((usu_permiso.ciudadano_id)=?1));", nativeQuery = true)

    public abstract ArrayList<Sondeo> findByCiudadano(Integer id);
}
