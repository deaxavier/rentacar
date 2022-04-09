package br.com.fiap.rentacar.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.fiap.rentacar.entities.ModeloEntity;
import br.com.fiap.rentacar.services.interfaces.ModeloService;

@RestController
public class ModeloController {
    private final ModeloService modeloService;

    @Autowired
    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

    @GetMapping("/modelos")
    public Iterable<ModeloEntity> findAll() {
        return modeloService.findAll();
    }

    @GetMapping("/modelos/{id}")
    public ModeloEntity findById(@PathVariable int id) {
        return modeloService.findById(id);
    }

    @GetMapping("/modelos/bymarca/{id}")
    public Iterable<ModeloEntity> findAllByMarcaId(@PathVariable int id) {
        return modeloService.findAllByMarcaId(id);
    }

    @PostMapping("/modelos")
    public ModeloEntity save(@RequestBody ModeloEntity modelo) {
        return modeloService.save(modelo);
    }

    @PutMapping("/modelos/{id}")
    public ModeloEntity update(@PathVariable int id, @RequestBody ModeloEntity modelo) {
        var modeloAtual = modeloService.findById(id);
        if (modeloAtual == null) {
            throw new IllegalArgumentException("Modelo não encontrado");
        }
        modelo.setId(id);
        return modeloService.save(modelo);
    }
}