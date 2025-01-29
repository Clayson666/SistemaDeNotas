package com.proyectoNotas.sistemasNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoNotas.sistemasNotas.model.Classroom;



@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {

    

}
