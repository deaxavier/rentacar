package br.com.fiap.rentacar.controllers;
import br.com.fiap.rentacar.entities.ConcessionariaEntity;
import br.com.fiap.rentacar.services.interfaces.ConcessionariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConcessionariaController {
    private final ConcessionariaService concessionariaService;

    @Autowired
    public ConcessionariaController(ConcessionariaService concessionariaService) {
        this.concessionariaService = concessionariaService;
    }

    @GetMapping("/concessionarias")
    public Iterable<ConcessionariaEntity> findAll() {
        return concessionariaService.findAll();
    }

    @GetMapping("/concessionarias/{id}")
    public ConcessionariaEntity findById(@PathVariable int id) {
        return concessionariaService.findById(id);
    }


    @PostMapping("/concessionarias")
    public ConcessionariaEntity save(@RequestBody ConcessionariaEntity concessionaria) {
        return concessionariaService.save(concessionaria);
    }

    @PutMapping("/concessionarias/{id}")
    public ConcessionariaEntity update(@PathVariable int id, @RequestBody ConcessionariaEntity concessionaria) {
        var concessionariaAtual = concessionariaService.findById(id);
        if(concessionaria == null) {
            throw new RuntimeException("Concessionaria não encontrada");
        }
        concessionaria.setId(id);
        return concessionariaService.save(concessionaria);
    }
}