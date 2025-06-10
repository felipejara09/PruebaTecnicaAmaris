package com.example.prueba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRUEBAESTUDIANTE")
public class Estudiante {

    @Id
    private int eid;
    private String nombre;
    private String especialidad;
    private String grado;

    public int getEid() { return eid; }
    public void setEid(int eid) { this.eid = eid; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getGrado() { return grado; }
    public void setGrado(String grado) { this.grado = grado; }
}
