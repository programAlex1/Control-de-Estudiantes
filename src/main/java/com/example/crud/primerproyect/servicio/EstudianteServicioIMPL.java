/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.crud.primerproyect.servicio;

import com.example.crud.primerproyect.entidad.Estudiante;
import com.example.crud.primerproyect.repository.EstudianteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServicioIMPL implements EstudianteServicio{
    
    @Autowired
    private EstudianteRepository repositorio;
    
    
    @Override
    public List<Estudiante> listarEstudiantes() {
        return repositorio.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstudianteId(Long id) {
        return  repositorio.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudianteId(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    @Override
    public void eliminarEstudianteId(Long id) {
        repositorio.deleteById(id);
    }

    @Override
    public Estudiante buscarEstudiantePorEmail(String email) {
        return repositorio.findByEmail(email);
    }

    

   

   
    
}
