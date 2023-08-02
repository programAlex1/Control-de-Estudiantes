
package com.example.crud.primerproyect.controller;
import com.example.crud.primerproyect.entidad.Estudiante;
import com.example.crud.primerproyect.servicio.EstudianteServicio;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ControllerEstudiante {
    @Autowired
    private EstudianteServicio servicio;
  
    @GetMapping({"/estudiantes","/"})
    public String Listarestudiantes(Model modelo){
        modelo.addAttribute("estudiantes",servicio.listarEstudiantes());
        return "estudiantes"; //archivo html estudiantes
    }
    
    @GetMapping("/estudiantes/nuevo")
    public String MostrarFormulario(Model modelo){
        Estudiante estudiante = new Estudiante();
        modelo.addAttribute("estudiante",estudiante);
        return "crear_estudiante"; // archivo html
    }
    
    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
         Estudiante email = servicio.buscarEstudiantePorEmail(estudiante.getEmail());
         if(email == null){
             servicio.guardarEstudiante(estudiante);
             
         }else{
             return "Existe un usuario con el email " + estudiante.getEmail();
         }
        
        return "redirect:/estudiantes";
    }
    
    @GetMapping("/estudiantes/editar/{id}")
    public String mostrarformdeeditar(@PathVariable Long id,Model modelo){
        modelo.addAttribute("estudiante",servicio.obtenerEstudianteId(id));
        return "editar_estudiante";
    }
    
       
    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id,@ModelAttribute("estudiante") Estudiante estudiante, Model modelo){
        Estudiante email = servicio.buscarEstudiantePorEmail(estudiante.getEmail());
        Estudiante estudianteExistente = servicio.obtenerEstudianteId(id);
        
        if(email == null||email.getEmail()== estudianteExistente.getEmail()){
              estudianteExistente.setId(id);
              estudianteExistente.setNombre(estudiante.getNombre());
              estudianteExistente.setApellido(estudiante.getApellido());
              estudianteExistente.setEmail(estudiante.getEmail());
              servicio.actualizarEstudianteId(estudianteExistente);
             
        }else{
             return "Existe un usuario con el email " + estudiante.getEmail();
        }
        return"redirect:/estudiantes";
    
    }
    @GetMapping("/estudiantes/{id}")
    public String eliminarEstudiante(@PathVariable Long id){
        servicio.eliminarEstudianteId(id);
        return"redirect:/estudiantes";
    }
    
    
      
    
}
