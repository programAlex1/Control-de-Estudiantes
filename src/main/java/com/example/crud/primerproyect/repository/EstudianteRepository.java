/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.crud.primerproyect.repository;

import com.example.crud.primerproyect.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author User
 */
public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{
    
  Estudiante findByEmail(String email);
        
    
    
}
