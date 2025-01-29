package com.proyectoNotas.sistemasNotas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class TeacherController {


    @GetMapping("/login")
    public String login() {
        return "usuario/index" ;
    }
    
    

}
