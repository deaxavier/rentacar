package br.com.fiap.rentacar.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.fiap.rentacar.entities.ClienteEntity;
import br.com.fiap.rentacar.services.interfaces.ClienteService;

@RestController
public class ClienteController {
    private final ClienteService clienteService;

    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/clientes")
    public Iterable<ClienteEntity> findAll() {
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}")
    public ClienteEntity findById(@PathVariable int id) {
        return clienteService.findById(id);
    }

    @GetMapping("/clientes/bycpf/{cpf}")
    public ClienteEntity findByCpf(@PathVariable String cpf) {
        return clienteService.findByCpf(cpf);
    }

    @GetMapping("/clientes/byemail/{email}")
    public ClienteEntity findByEmail(@PathVariable String email) {
        return clienteService.findByEmail(email);
    }

    @PostMapping("/clientes")
    public ClienteEntity save(@RequestBody ClienteEntity cliente) {
        return clienteService.save(cliente);
    }

    @PutMapping("/clientes/{id}")
    public ClienteEntity update(@PathVariable int id, @RequestBody ClienteEntity cliente) {
        var clienteAtual = clienteService.findById(id);
        if(clienteAtual == null) {
            throw new RuntimeException("Cliente não encontrado");
        }
        cliente.setId(id);
        return clienteService.save(cliente);
    }
}