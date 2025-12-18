package com.navidam.api.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.navidam.api.jpa.entity.PersonasEntity;
import com.navidam.api.jpa.repository.PersonasRepository;
@Service
public class PersonasServiceImpl implements PersonaService {

    private final PersonasRepository personasRepository;

    public PersonasServiceImpl(PersonasRepository personasRepository) {
        this.personasRepository = personasRepository;
    }

    @Override
    public List<PersonasEntity> getAllPersonas(String ordenadrPor,String direccion) {
        Sort.Direction dir;
        if(direccion.equalsIgnoreCase("ASC")){
            dir= Sort.Direction.ASC;
        }else{
            dir= Sort.Direction.DESC;
        }
        List<PersonasEntity> personas = personasRepository.findAll(Sort.by(dir, ordenadrPor));
        personas.add(new PersonasEntity(0,"Nueva Persona",""));
        return personas;
    }

}
