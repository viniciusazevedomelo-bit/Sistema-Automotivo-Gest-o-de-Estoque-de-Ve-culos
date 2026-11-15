package com.fecaf.automotivo.controller;

import com.fecaf.automotivo.model.Marca;
import com.fecaf.automotivo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @GetMapping
    public List<Marca> listar() {
        return marcaRepository.findAll();
    }

    @PostMapping
    public Marca salvar(@RequestBody Marca marca) {
        return marcaRepository.save(marca);
    }
}
