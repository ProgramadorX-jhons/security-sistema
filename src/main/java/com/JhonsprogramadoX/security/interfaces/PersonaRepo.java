package com.JhonsprogramadoX.security.interfaces;

import com.JhonsprogramadoX.security.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Long> {

    //esta conexxcion es donde las librerias del spring jalara
}
