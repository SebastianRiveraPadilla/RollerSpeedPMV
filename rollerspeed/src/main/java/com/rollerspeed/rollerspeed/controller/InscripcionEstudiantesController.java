package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.EstudianteRegistro;
import com.rollerspeed.rollerspeed.service.EstudianteRegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class InscripcionEstudiantesController {

    @Autowired
    private EstudianteRegistroService service;

    @GetMapping("/inscripcion_estudiantes")
    public String mostrarFormulario() {
        return "inscripcion_estudiantes";
    }

    @PostMapping("/guardar")
    public String guardar(EstudianteRegistro estudiante, RedirectAttributes redirectAttributes) {
        service.guardar(estudiante);

        redirectAttributes.addFlashAttribute("mensaje", "Estudiante agregado correctamente");

        return "redirect:/inscripcion_estudiantes";
    }
}

