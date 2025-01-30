package com.proyectoNotas.sistemasNotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.proyectoNotas.sistemasNotas.model.Cycle;

@Repository
public interface CycleRepository extends JpaRepository<Cycle,Integer>{

    @Query("SELECT c FROM Cycle c ORDER BY c.id DESC")
    List<Cycle> cycleList();
   

}
