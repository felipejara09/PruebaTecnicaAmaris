package com.example.prueba.controller;

import com.example.prueba.model.Estudiante;
import com.example.prueba.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @GetMapping
    public List<Estudiante> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> getById(@PathVariable int id) {
        return service.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Estudiante create(@RequestBody Estudiante estudiante) {
        return service.save(estudiante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> update(@PathVariable int id, @RequestBody Estudiante estudiante) {
        Estudiante updated = service.update(id, estudiante);
        if (updated != null) return ResponseEntity.ok(updated);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
