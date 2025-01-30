package com.proyectoNotas.sistemasNotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyectoNotas.sistemasNotas.model.Classroom;
import com.proyectoNotas.sistemasNotas.model.Cycle;
import com.proyectoNotas.sistemasNotas.repository.UserPassRepository;
import com.proyectoNotas.sistemasNotas.service.ClassroomServiceImpl;
import com.proyectoNotas.sistemasNotas.service.CycleServiceImpl;
import com.proyectoNotas.sistemasNotas.service.UserPassServiceImpl;

import org.springframework.ui.Model;
import jakarta.servlet.http.HttpSession;



@Controller
public class TeacherController {

    @Autowired
    private UserPassServiceImpl userPassServiceImpl;

    @Autowired
    private CycleServiceImpl cycleServiceImpl;

    @Autowired
    private ClassroomServiceImpl classroomServiceImpl;



    
    //vista de login
    @GetMapping("/login")
    public String login() {
        return "user/index" ;
    }



    //validando usuario y contraseña
    @PostMapping("/main")
    public String principal(@RequestParam String user, @RequestParam String password, Model model,HttpSession session){
        
        boolean validate = userPassServiceImpl.validateUser(user,password);

        if (validate==true) {
            System.out.println("usuario valido");
            //TRAENDO ID DE USUARIO DEL DOCENTE
            Integer idUsuario = userPassServiceImpl.findUserId(user);
            session.setAttribute("idUsuario", idUsuario);

            //TRAENDO DATOS PARA COLOCAR CICLOS
            List<Cycle> cycles = cycleServiceImpl.cycleList();
            model.addAttribute("cycleList", cycles);

          
            //LISTANDO LAS SECCIONES
            Integer idTeacher = userPassServiceImpl.findByIdteacher(idUsuario);
            List<Classroom> classrooms = classroomServiceImpl.classroomByCycleAndTeacher(2,idTeacher);

            model.addAttribute("classroomsList", classrooms);

            return "user/inicio";
        }else{
            System.out.println("usuario invalido");
            return "redirect:/login";
        }

    }
    

}
