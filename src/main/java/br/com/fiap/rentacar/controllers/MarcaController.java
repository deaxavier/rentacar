package br.com.fiap.rentacar.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.fiap.rentacar.entities.MarcaEntity;
import br.com.fiap.rentacar.services.interfaces.MarcaService;

@RestController
public class MarcaController {
    private final MarcaService marcaService;

    @Autowired
    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @GetMapping("/marcas")
    public Iterable<MarcaEntity> findAll() {
        return marcaService.findAll();
    }

    @GetMapping("/marcas/{id}")
    public MarcaEntity findById(@PathVariable int id) {
        return marcaService.findById(id);
    }

    @PostMapping("/marcas")
    public MarcaEntity save(@RequestBody MarcaEntity marca) {
        return marcaService.save(marca);
    }

    @PutMapping("/marcas/{id}")
    public MarcaEntity update(@PathVariable int id, @RequestBody MarcaEntity marca) {
        var marcaAtual = marcaService.findById(id);
        if (marcaAtual == null) {
            throw new RuntimeException("Marca não encontrada");
        }
        marca.setId(id);
        return marcaService.save(marca);
    }
}