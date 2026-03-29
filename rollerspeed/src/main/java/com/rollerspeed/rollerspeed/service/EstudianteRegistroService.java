package com.rollerspeed.rollerspeed.service;

import com.rollerspeed.rollerspeed.model.EstudianteRegistro;
import com.rollerspeed.rollerspeed.repository.EstudianteRegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteRegistroService {

    @Autowired
    private EstudianteRegistroRepository repo;

    public List<EstudianteRegistro> listar() {
        return repo.findAll();
    }

    public void guardar(EstudianteRegistro e) {
        repo.save(e);
    }

    public EstudianteRegistro buscar(Long id) {
    EstudianteRegistro e = repo.findById(id).orElse(null);
    if (e == null) return null;
    // Crear un objeto nuevo para la vista (desacoplar de la sesión)
    EstudianteRegistro copia = new EstudianteRegistro();
    copia.setId(e.getId());
    copia.setNombre(e.getNombre());
    copia.setCorreo(e.getCorreo());
    return copia;
}

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}