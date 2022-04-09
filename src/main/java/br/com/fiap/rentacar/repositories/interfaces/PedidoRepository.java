package br.com.fiap.rentacar.repositories.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import br.com.fiap.rentacar.entities.PedidoEntity;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoEntity, Integer> {

    @Query(value = "select p from PedidoEntity p order by p.id desc")
    Iterable<PedidoEntity> findAllOrderByIdDesc();

    Iterable<PedidoEntity> findByClienteId(Integer id);
    Iterable<PedidoEntity> findByVeiculoId(Integer id);
    PedidoEntity findByVeiculoIdAndDataDevolucaoRealizadaIsNull(Integer id);
}
