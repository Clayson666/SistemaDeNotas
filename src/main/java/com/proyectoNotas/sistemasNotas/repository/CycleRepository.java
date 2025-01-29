package com.proyectoNotas.sistemasNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoNotas.sistemasNotas.model.Cycle;

@Repository
public interface CycleRepository extends JpaRepository<Cycle,Integer>{

}
