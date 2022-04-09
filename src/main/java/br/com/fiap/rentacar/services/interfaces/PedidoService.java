package br.com.fiap.rentacar.services.interfaces;

import br.com.fiap.rentacar.entities.PedidoEntity;

public interface PedidoService {

    PedidoEntity save(PedidoEntity pedido);

    Iterable<PedidoEntity> findByClienteId(int ClienteId);

    Iterable<PedidoEntity> findByVeiculoId(int VeiculoId);

    Iterable<PedidoEntity> findAll();

    PedidoEntity findById(int id);
}
