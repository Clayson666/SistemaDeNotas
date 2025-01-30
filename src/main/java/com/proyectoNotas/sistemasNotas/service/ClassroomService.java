package com.proyectoNotas.sistemasNotas.service;

import java.util.List;



import com.proyectoNotas.sistemasNotas.model.Classroom;

public interface ClassroomService {


List<Classroom> classroomByCycleAndTeacher(Integer idCycle, Integer idTeacher);

}
