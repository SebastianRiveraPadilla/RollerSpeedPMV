package com.rollerspeed.rollerspeed.controller;

import com.rollerspeed.rollerspeed.model.EstudianteRegistro;
import com.rollerspeed.rollerspeed.service.EstudianteRegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
@Tag(name = "Estudiantes", description = "Operaciones CRUD de estudiantes")
public class EstudianteApiController {

    @Autowired
    private EstudianteRegistroService service;

    @Operation(summary = "Listar estudiantes", description = "Obtiene todos los estudiantes registrados")
    @ApiResponse(responseCode = "200", description = "Lista obtenida correctamente")
    @GetMapping
    public List<EstudianteRegistro> listar() {
        return service.listar();
    }

    @Operation(summary = "Guardar estudiante", description = "Registra un nuevo estudiante")
    @ApiResponse(responseCode = "200", description = "Estudiante guardado correctamente")
    @PostMapping
    public EstudianteRegistro guardar(@RequestBody EstudianteRegistro e) {
        return service.guardar(e);
    }

    @Operation(summary = "Actualizar estudiante", description = "Actualiza los datos de un estudiante existente")
    @ApiResponse(responseCode = "200", description = "Estudiante actualizado correctamente")
    @PutMapping("/{id}")
    public EstudianteRegistro actualizar(@PathVariable Long id, @RequestBody EstudianteRegistro e) {
        return service.actualizar(id, e);
    }

    @Operation(summary = "Eliminar estudiante", description = "Elimina un estudiante por su ID")
    @ApiResponse(responseCode = "200", description = "Estudiante eliminado correctamente")
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
