package com.proyectoNotas.sistemasNotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoNotas.sistemasNotas.model.Classroom;
import com.proyectoNotas.sistemasNotas.repository.ClassroomRepository;


@Service

public class ClassroomServiceImpl implements ClassroomService{

    @Autowired private ClassroomRepository classroomRepository;
    



    @Override
    public List<Classroom> classroomByCycleAndTeacher(Integer idCycle, Integer idTeacher) {
        return  classroomRepository.classroomByCycleAndTeacher(idCycle,idTeacher);
    }

}
