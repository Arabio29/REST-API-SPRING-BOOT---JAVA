package com.example.Escuela.controller;

import com.example.Escuela.models.Nota;
import com.example.Escuela.service.NotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotasController {

    private final NotasService notasService;

    @Autowired
    public NotasController(NotasService notasService) {
        this.notasService = notasService;
    }

    @GetMapping("/notas/") //get
    public List<Nota> obtenerNotas(){
        return notasService.obtenerNotas();
    }

    @GetMapping("/notas/{id}")
    public Nota obtenerNotaPorId(@PathVariable("id") int id) {
        return notasService.obtenerNotaId(id);
    }

    @PostMapping("/notas/")
    public Nota agregarNota(@RequestBody Nota nota){
        return notasService.crearNota(nota);
    }
}

