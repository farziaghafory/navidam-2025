package com.navidam.api.jpa.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "personas")
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "Formato de email no válido")
    private String email;


    public PersonaEntity() {
}
        public PersonaEntity(Long id, String nombre,String email ){

            this.id = id;
            this.nombre = nombre;
            this.email = email;
        }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre ) {
        this.nombre = nombre;
    }            

    public String getEmail() {
        return email;
    } 
    public void setEmail(String email) {
        this.email = email;
    }
}
