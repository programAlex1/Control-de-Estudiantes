/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.crud.primerproyect.servicio;

import com.example.crud.primerproyect.entidad.Estudiante;
import java.util.List;

/**
 *
 * @author User
 */
public interface EstudianteServicio {

    public List<Estudiante> listarEstudiantes();

    public Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerEstudianteId(Long id);

    public Estudiante actualizarEstudianteId(Estudiante estudiante);

    public void eliminarEstudianteId(Long id);
    
    public Estudiante buscarEstudiantePorEmail(String email);
    

   

}
