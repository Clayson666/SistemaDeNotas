package com.proyectoNotas.sistemasNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoNotas.sistemasNotas.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
