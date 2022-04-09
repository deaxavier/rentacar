package br.com.fiap.rentacar.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.fiap.rentacar.entities.PedidoEntity;
import br.com.fiap.rentacar.services.interfaces.PedidoService;

@RestController
public class PedidoController {
    private final PedidoService pedidoService;

    @Autowired
    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("/pedidos")
    public Iterable<PedidoEntity> findAll() {
        return pedidoService.findAll();
    }

    @GetMapping("/pedidos/{id}")
    public PedidoEntity findById(@PathVariable int id) {
        return pedidoService.findById(id);
    }

    @GetMapping("/pedidos/porcliente/{clienteId}")
    public Iterable<PedidoEntity> findByClienteId(@PathVariable int clienteId) {
        return pedidoService.findByClienteId(clienteId);
    }

    @GetMapping("/pedidos/porveiculo/{veiculoId}")
    public Iterable<PedidoEntity> findByVeiculoId(@PathVariable int veiculoId) {
        return pedidoService.findByVeiculoId(veiculoId);
    }

    @PostMapping("/pedidos/cadastrar")
    public PedidoEntity save(@RequestBody PedidoEntity pedido) {
        try {
            return pedidoService.save(pedido);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao cadastrar pedido");
        }
    }
}
