package br.com.fiap.rentacar.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.fiap.rentacar.entities.VeiculoEntity;
import br.com.fiap.rentacar.services.interfaces.VeiculoService;

@RestController
public class VeiculoController {
    private final VeiculoService veiculoService;

    @Autowired
    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    @GetMapping(path = "/veiculos")
    public Iterable<VeiculoEntity> findAll() {
        return veiculoService.findAll();
    }

    @GetMapping(path = "/veiculos/{id}")
    public VeiculoEntity findById(@PathVariable int id) {
        return veiculoService.findById(id);
    }

    @GetMapping(path = "/veiculos/byconcessionaria/{id}")
    public Iterable<VeiculoEntity> findByConcessionariaId(@PathVariable int id) {
        return veiculoService.findByConcessionariaId(id);
    }

    @GetMapping(path = "/veiculos/ativos")
    public Iterable<VeiculoEntity> findAtivos() {
        return veiculoService.findByDisponivel("Y");
    }

    @PostMapping(path = "/veiculos")
    public VeiculoEntity save(@RequestBody VeiculoEntity veiculo) {
        veiculo.setDisponivel("Y");
        return veiculoService.save(veiculo);
    }

    @PutMapping(path = "/veiculos/{id}")
    public VeiculoEntity update(@RequestBody VeiculoEntity veiculo, @PathVariable int id) {
        var veiculoAtual = veiculoService.findById(id);
        if (veiculoAtual == null) {
            throw new RuntimeException("Veiculo não encontrado");
        }

        if (veiculoAtual.getDisponivel().equals("N")) {
            throw new RuntimeException("Veiculo não está disponível");
        }
        veiculo.setId(id);
        veiculo.setDisponivel("Y");
        return veiculoService.save(veiculo);
    }

    @PutMapping(path = "/veiculos/devolver/{id}/{concessionariaId}")
    public void DevolverVeiculo(@PathVariable int id, @PathVariable int concessionariaId) {
        try {
            var veiculo = veiculoService.findById(id);
            if (veiculo == null) {
                throw new RuntimeException("Veiculo não encontrado");
            }

            if (veiculo.getDisponivel().equals("Y")) {
                throw new RuntimeException("Veiculo já está disponível");
            }

            veiculoService.Devolver(id, concessionariaId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}