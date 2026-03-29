package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.EstudianteRegistro;
import com.rollerspeed.rollerspeed.service.EstudianteRegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class InscripcionEstudiantesController {

    @Autowired
    private EstudianteRegistroService service;

    @GetMapping("/inscripcion_estudiantes")
    public String mostrarFormulario() {
        return "inscripcion_estudiantes";
    }

    @PostMapping("/guardar")
    public String guardar(EstudianteRegistro estudiante) {
        service.guardar(estudiante);
        return "redirect:/listar_estudiantes";
    }
}

