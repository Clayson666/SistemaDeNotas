package com.proyectoNotas.sistemasNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoNotas.sistemasNotas.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
