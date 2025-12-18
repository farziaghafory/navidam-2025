package com.navidam.api.jpa.repository;

import com.navidam.api.jpa.entity.PersonaEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
   
    Optional<PersonaEntity> findByEmail(String email);
   
    boolean existsByEmail(String email);
}