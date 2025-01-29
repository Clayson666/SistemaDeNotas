package com.proyectoNotas.sistemasNotas.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String studentName;
    private String studentLastname;
    private String studentCode;


    @ManyToMany
    @JoinTable(name = "inscription", joinColumns = @JoinColumn(name = "student_id"),inverseJoinColumns = @JoinColumn(name = "classroom_id"))
    private List<Classroom> classrooms;


}
