package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InscripcionInstructoresController {

    @GetMapping("/inscripcion_instructores")
    public String inicio() {
        return "inscripcion_instructores.html";
    }
}
