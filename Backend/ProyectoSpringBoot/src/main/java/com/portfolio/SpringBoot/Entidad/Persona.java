package com.portfolio.SpringBoot.Entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    @NotNull
    @Size(min=1, max=60, message="Debe tener entre 1 y 60 carácteres")
    private String nombre;
    @NotNull
    @Size(min=1, max=60, message="Debe tener entre 1 y 60 carácteres")
    private String apellido;
    @Size(min=1, max=60, message="Debe tener entre 1 y 60 carácteres")
    private String imagen;
}
