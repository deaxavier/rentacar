package br.com.fiap.rentacar.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fiap.rentacar.entities.PedidoEntity;
import br.com.fiap.rentacar.repositories.interfaces.PedidoRepository;
import br.com.fiap.rentacar.repositories.interfaces.VeiculoRepository;
import br.com.fiap.rentacar.services.interfaces.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {
    private final PedidoRepository pedidoRepository;
    private final VeiculoRepository veiculoRepository;

    @Autowired
    public PedidoServiceImpl(PedidoRepository pedidoRepository, VeiculoRepository veiculoRepository) {
        this.pedidoRepository = pedidoRepository;
        this.veiculoRepository = veiculoRepository;
    }

    public PedidoEntity save(PedidoEntity pedido) {
        try {
            pedido.setDataPedido(new Date());

            Calendar cal = Calendar.getInstance();
            cal.setTime(pedido.getDataPedido());
            cal.add(Calendar.DATE, pedido.getQuantidadeDiasSolicitado());
            Date endDate = cal.getTime();
            pedido.setDataDevolucaoEstimada(endDate);

            var veiculo = veiculoRepository.findById(pedido.getVeiculoId()).orElse(null);
            if (veiculo == null) {
                throw new Exception("Veiculo não encontrado");
            }

            if (veiculo.getDisponivel().equals("N")) {
                throw new Exception("Veiculo indisponível");
            }

            pedido.setValorPedidoEstimado(veiculo.getValorDiaria() * pedido.getQuantidadeDiasSolicitado());
            veiculo.setDisponivel("N");
            veiculoRepository.save(veiculo);
            return pedidoRepository.save(pedido);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar pedido");
        }
    }

    public Iterable<PedidoEntity> findByClienteId(int ClienteId) {
        return pedidoRepository.findByClienteId(ClienteId);
    }

    public Iterable<PedidoEntity> findByVeiculoId(int VeiculoId) {
        return pedidoRepository.findByVeiculoId(VeiculoId);
    }

    public Iterable<PedidoEntity> findAll() {
        return pedidoRepository.findAllOrderByIdDesc();
    }

    public PedidoEntity findById(int id) {
        return pedidoRepository.findById(id).orElse(null);
    }
}
