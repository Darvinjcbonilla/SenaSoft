package com.SenaSoft.senasoft.repositorios;

import com.SenaSoft.senasoft.modelos.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {

}
