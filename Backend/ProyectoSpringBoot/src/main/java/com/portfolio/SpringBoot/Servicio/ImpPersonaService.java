package com.portfolio.SpringBoot.Servicio;

import com.portfolio.SpringBoot.Entidad.Persona;
import com.portfolio.SpringBoot.Interface.IPersonaService;
import com.portfolio.SpringBoot.Repositorio.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired IPersonaRepository iPersonaRepository;
    
    @Override
    public List<Persona> getPersona() {
        return iPersonaRepository.findAll();
    }

    @Override
    public void savePersona(Persona persona) {
        iPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        iPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        return iPersonaRepository.findById(id).orElse(null);
    }
    
}
