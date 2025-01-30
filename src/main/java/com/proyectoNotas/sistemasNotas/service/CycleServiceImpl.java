package com.proyectoNotas.sistemasNotas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoNotas.sistemasNotas.model.Cycle;
import com.proyectoNotas.sistemasNotas.repository.CycleRepository;


@Service
public class CycleServiceImpl implements CycleService {

    @Autowired CycleRepository cycleRepository;

    @Override
    public List<Cycle> cycleList() {
        return cycleRepository.cycleList();
    }

}
