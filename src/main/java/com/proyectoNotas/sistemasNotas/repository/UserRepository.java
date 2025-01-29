package com.proyectoNotas.sistemasNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoNotas.sistemasNotas.model.UserPass;

@Repository
public interface UserRepository extends JpaRepository <UserPass,Integer>{
    
}
