package com.proyectoNotas.sistemasNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoNotas.sistemasNotas.model.Week;

public interface WeekRepository extends JpaRepository<Week, Integer> {

}
