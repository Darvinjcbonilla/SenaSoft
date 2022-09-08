package com.SenaSoft.senasoft.repositorios;

import com.SenaSoft.senasoft.modelos.Sondeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface SondeoRepository extends JpaRepository<Sondeo, Integer> {
    @Query(value = "SELECT * FROM sondeo where ciudadano_id = ?1", nativeQuery = true)

    public abstract ArrayList<Sondeo> findByCiudadano(Integer id);
}
