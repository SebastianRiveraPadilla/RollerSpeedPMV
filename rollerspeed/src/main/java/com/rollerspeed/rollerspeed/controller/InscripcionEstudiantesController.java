package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InscripcionEstudiantesController {

    @GetMapping("/inscripcion_estudiantes")
    public String inicio() {
        return "inscripcion_estudiantes.html";
    }
}
