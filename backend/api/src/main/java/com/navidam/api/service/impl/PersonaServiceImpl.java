package com.navidam.api.service.impl;

import com.navidam.api.dto.request.PersonaRequest;
import com.navidam.api.jpa.entity.PersonaEntity;
import com.navidam.api.jpa.repository.PersonaRepository;
import com.navidam.api.service.PersonaService;
import com.navidam.api.mapper.PersonaMapper; // Revisa que esta ruta sea la de tu Mapper
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaMapper personaMapper;

    @Override
    public PersonaEntity guardarPersona(PersonaRequest request) {
        if (personaRepository.existsByEmail(request.email())) {
            throw new RuntimeException("Email ya registrado");
        }
        PersonaEntity entity = personaMapper.toEntity(request);
        return personaRepository.save(entity);
    }

    @Override
    public List<PersonaEntity> obtenerTodas() {
        return personaRepository.findAll();
    }

    @Override
    public void eliminarPersona(Long id) {
        if (!personaRepository.existsById(id)) {
            throw new RuntimeException("Persona no encontrada");
        }
        personaRepository.deleteById(id);
    }

  @Override
    public List<PersonaEntity> getAllPersonas(String ordenadrPor,String direccion) {
        Sort.Direction dir;
        if(direccion.equalsIgnoreCase("ASC")){
            dir= Sort.Direction.ASC;
        }else{
            dir= Sort.Direction.DESC;
        }
        List<PersonaEntity> personas = personaRepository.findAll(Sort.by(dir, ordenadrPor));
        personas.add(new PersonaEntity((long) 1,"",""));
        return personas;
    }
 
}
