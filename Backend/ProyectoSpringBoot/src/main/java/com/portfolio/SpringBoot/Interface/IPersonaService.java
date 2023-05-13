package com.portfolio.SpringBoot.Interface;

import com.portfolio.SpringBoot.Entidad.Persona;
import java.util.List;

public interface IPersonaService {
    //Obtener una lista de personas
    public List<Persona> getPersona();
    
    //Guardar una persona
    public void savePersona(Persona persona);
    
    //Eliminar una persona
    public void deletePersona(Long id);
    
    //Buscar una persona
    public Persona findPersona(Long id);
    
}
