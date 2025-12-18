package com.navidam.api.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navidam.api.jpa.entity.PersonasEntity;

public interface  PersonasRepository extends JpaRepository<PersonasEntity, Long>
 {
    
}
