package com.example.prueba.service;

import com.example.prueba.model.Estudiante;
import com.example.prueba.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository repository;

    public List<Estudiante> getAll() {
        return repository.findAll();
    }

    public Optional<Estudiante> getById(int id) {
        return repository.findById(id);
    }

    public Estudiante save(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    public Estudiante update(int id, Estudiante e) {
        if (repository.existsById(id)) {
            e.setEid(id);
            return repository.save(e);
        }
        return null;
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
