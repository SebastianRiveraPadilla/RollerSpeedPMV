package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListarEstudiantesController {

    @GetMapping("/listar_estudiantes")
    public String inicio() {
        return "listar_estudiantes.html";
    }
}
