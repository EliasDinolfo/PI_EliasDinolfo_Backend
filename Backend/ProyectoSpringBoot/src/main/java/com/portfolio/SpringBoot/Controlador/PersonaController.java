package com.portfolio.SpringBoot.Controlador;

import com.portfolio.SpringBoot.Entidad.Persona;
import com.portfolio.SpringBoot.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService iPersonaService;
    
    @GetMapping("personas/obtener")
    public List<Persona> getPersona(){
        return iPersonaService.getPersona();
    }
    
    @PostMapping("personas/crear")
    public String createPersona(@RequestBody Persona persona){
        iPersonaService.savePersona(persona);
        return "La persona fue creada.";
    }
    
    @DeleteMapping("personas/eliminar/{id}")
    public String deletePerosna(@PathVariable Long id){
        iPersonaService.deletePersona(id);
        return "La persona fue eliminada.";
    }
    
    @PutMapping("personas/editar/{id}")
    public Persona updatePersona(@PathVariable Long id,
            @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido,
            @RequestParam("imagen") String nuevaImagen){
        Persona persona = iPersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImagen(nuevaImagen);
        iPersonaService.savePersona(persona);
        return persona;
    }
    
    @GetMapping("personas/devolver/perfil")
    public Persona findPersona(){
        return iPersonaService.findPersona((long)1);
    }
    
}
