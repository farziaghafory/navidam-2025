package com.navidam.api.service;

import com.navidam.api.dto.request.PersonaRequest;
import com.navidam.api.jpa.entity.PersonaEntity;
import java.util.List;

public interface PersonaService {
    PersonaEntity guardarPersona(PersonaRequest request);
    List<PersonaEntity> obtenerTodas();
    void eliminarPersona(Long id); // Asegúrate de que se llame así
    List<PersonaEntity> getAllPersonas(String ordenarPor, String direccion);
}