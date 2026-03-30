package com.rollerspeed.rollerspeed.model;

import jakarta.persistence.*;
import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Schema(description = "Entidad que representa un estudiante")
public class EstudianteRegistro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "ID único del estudiante", example = "1")
    private Long id;

    @Schema(description = "Nombre del estudiante", example = "Juan Pérez")
    private String nombre;

    @Schema(description = "Correo electrónico del estudiante", example = "juan@gmail.com")
    private String correo;

    public EstudianteRegistro() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) { 
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}