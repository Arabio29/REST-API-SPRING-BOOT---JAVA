package com.example.Escuela.service;

import com.example.Escuela.models.Nota;
import org.springframework.stereotype.Service; // Añadí la importación de la anotación Service

import java.util.ArrayList;
import java.util.List;

@Service // Añadí la anotación Service para que Spring reconozca esta clase como un servicio
public class NotasService {
    private List<Nota> notas;

    public NotasService() {
        this.notas = new ArrayList<>();
    }

    // Obtener todas las notas
    public List<Nota> obtenerNotas(){
        return this.notas;
    }

    // Obtener una nota por su id
    public Nota obtenerNotaId(Integer id){
        return notas.stream()
                .filter(nota -> nota.getId() == (id))
                .findFirst().orElse(null); // Añadí un manejo para el caso en que no se encuentre ninguna nota con el id especificado
    }


    // Crear una nueva nota
    public Nota crearNota(Nota nota) {
        this.notas.add(nota);
        return nota;
    }
}
