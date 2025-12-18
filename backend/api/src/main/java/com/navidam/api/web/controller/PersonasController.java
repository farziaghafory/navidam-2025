package com.navidam.api.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.navidam.api.jpa.entity.PersonasEntity;
import com.navidam.api.service.PersonaService;

@RestController
public class PersonasController {

    private final PersonaService personaService;
    public PersonasController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/personas")
    public List<PersonasEntity> getAllPersonas(
        @RequestParam(defaultValue = "id") String ordenarPor,
        @RequestParam(defaultValue = "ASC") String direccion) {
        return personaService.getAllPersonas(ordenarPor, direccion);
    }

    

    


    
}
