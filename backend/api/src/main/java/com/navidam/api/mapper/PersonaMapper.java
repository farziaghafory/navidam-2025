package com.navidam.api.mapper;

import org.springframework.stereotype.Component;

import com.navidam.api.dto.request.PersonaRequest;
import com.navidam.api.dto.response.PersonaResponse;
import com.navidam.api.dto.response.PersonaResumeResponse;
import com.navidam.api.jpa.entity.PersonaEntity;

@Component
public class PersonaMapper {

    public PersonaEntity toEntity(PersonaRequest request) {
        PersonaEntity entity = new PersonaEntity();
        entity.setNombre(request.nombre());
        entity.setEmail(request.email());
        return entity;
    }

    public PersonaResponse toResponse(PersonaEntity entity) {
        return new PersonaResponse(
            entity.getId(),
            entity.getNombre(),
            entity.getEmail()
        );
    }

    public PersonaResumeResponse toResumeResponse(PersonaEntity entity) {
        return new PersonaResumeResponse(
            entity.getId(),
            entity.getNombre()
        );
    }
}