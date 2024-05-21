package com.JhonsprogramadoX.security.service;

import com.JhonsprogramadoX.security.ServiceIMPLE.IPersonaService;
import com.JhonsprogramadoX.security.interfaces.PersonaRepo;
import com.JhonsprogramadoX.security.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepo data;
    @Override
    public List<Persona> listar() {
        return (List<Persona>)data.findAll();
    }

    @Override
    public Optional<Persona> listarId(Long id) {
        return data.findById(id);
    }

    @Override
    public Long save(Persona persona) {
        Persona savedPersona = data.save(persona);
        return savedPersona.getId();
    }

    @Override
    public void delete(Long id) {
        data.deleteById(id);
    }
}
