package com.JhonsprogramadoX.security.ServiceIMPLE;

import com.JhonsprogramadoX.security.modelo.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {

    //aqui ban los metodos para los que se listaran

    public List<Persona> listar();
    public Optional<Persona> listarId(Long id);
    public Long save (Persona persona);
    public void delete(Long id);
}
