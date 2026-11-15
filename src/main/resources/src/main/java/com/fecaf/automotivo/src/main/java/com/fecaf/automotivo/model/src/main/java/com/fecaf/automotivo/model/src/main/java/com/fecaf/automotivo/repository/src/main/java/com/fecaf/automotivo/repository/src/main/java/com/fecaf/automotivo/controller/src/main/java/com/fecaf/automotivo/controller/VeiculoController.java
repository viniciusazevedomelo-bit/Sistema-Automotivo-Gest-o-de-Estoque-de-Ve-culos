package com.fecaf.automotivo.controller;

import com.fecaf.automotivo.model.Veiculo;
import com.fecaf.automotivo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping
    public List<Veiculo> listar() {
        return veiculoRepository.findAll();
    }

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }
}
