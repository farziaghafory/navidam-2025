package com.navidam.api.web.controller;

import com.navidam.api.dto.request.PersonaRequest;
import com.navidam.api.dto.response.PersonaResponse;
import com.navidam.api.jpa.entity.PersonaEntity;
import com.navidam.api.service.PersonaService;
import com.navidam.api.mapper.PersonaMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") 
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @Autowired
    private PersonaMapper personaMapper;

    @PostMapping("personas")
    public ResponseEntity<PersonaResponse> crear(@Valid @RequestBody PersonaRequest request) {
        PersonaEntity guardada = personaService.guardarPersona(request);
        return ResponseEntity.ok(personaMapper.toResponse(guardada));
    }

@GetMapping("/personas")
    public List<PersonaEntity> getAllPersonas(
        @RequestParam(defaultValue = "id") String ordenarPor,
        @RequestParam(defaultValue = "ASC") String direccion) {
        return personaService.getAllPersonas(ordenarPor, direccion);
    }
 



    @DeleteMapping("/personas/api/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        personaService.eliminarPersona(id); 
        return ResponseEntity.noContent().build();
}
}