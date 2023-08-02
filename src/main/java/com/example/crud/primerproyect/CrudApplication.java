package com.example.crud.primerproyect;

import com.example.crud.primerproyect.entidad.Estudiante;
import com.example.crud.primerproyect.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }
    @Autowired
    private EstudianteRepository repositorio;

    @Override
    public void run(String... args) throws Exception {

    }

}
