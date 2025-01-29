package com.proyectoNotas.sistemasNotas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectoNotas.sistemasNotas.model.Score;

@Repository
public interface ScoreRepository extends JpaRepository<Score,Integer>{

}
