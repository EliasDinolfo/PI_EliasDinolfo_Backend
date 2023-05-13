package com.portfolio.SpringBoot.Repositorio;

import com.portfolio.SpringBoot.Entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
