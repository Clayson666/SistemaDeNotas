package com.proyectoNotas.sistemasNotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.proyectoNotas.sistemasNotas.model.Classroom;



@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {

    @Query("SELECT c FROM Classroom c WHERE c.cycle.id = :cycleId AND c.teacher.id = :teacherId")
    List<Classroom> classroomByCycleAndTeacher(@Param("cycleId") Integer idCycle, @Param("teacherId") Integer idTeacher);

}
