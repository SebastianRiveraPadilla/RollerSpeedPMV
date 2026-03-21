package com.rollerspeed.rollerspeed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventosController {

    @GetMapping("/eventos_escuela")
    public String inicio() {
        return "eventos_escuela.html";
    }
}
