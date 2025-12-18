package com.navidam.api.service;
import java.util.List;

import com.navidam.api.jpa.entity.PersonasEntity;


public interface  PersonaService {
    

    public List<PersonasEntity> getAllPersonas(String ordenadrPor,String direccion);
}
