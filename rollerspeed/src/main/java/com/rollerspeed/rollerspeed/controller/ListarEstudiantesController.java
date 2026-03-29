package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.EstudianteRegistro;
import com.rollerspeed.rollerspeed.service.EstudianteRegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ListarEstudiantesController {

    @Autowired
    private EstudianteRegistroService service;

    @GetMapping("/listar_estudiantes")
    public String listar(Model model) {
        model.addAttribute("lista", service.listar());
        return "listar_estudiantes";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        service.eliminar(id);
            return "redirect:/listar_estudiantes";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("estudiante", service.buscar(id));
        return "editar_listar_estudiantes";
    }

    @PostMapping("/actualizar")
    public String actualizar(@ModelAttribute EstudianteRegistro estudiante) {
    EstudianteRegistro eExistente = service.buscar(estudiante.getId());
    if (eExistente != null) {
        eExistente.setNombre(estudiante.getNombre());
        eExistente.setCorreo(estudiante.getCorreo());
        service.guardar(eExistente);
    }
    return "redirect:/listar_estudiantes";
    }
}
