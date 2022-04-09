package br.com.fiap.rentacar.repositories.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import br.com.fiap.rentacar.entities.VeiculoEntity;

@Repository
public interface VeiculoRepository extends CrudRepository<VeiculoEntity, Integer> {
    @Query(value = "select v from VeiculoEntity v order by v.id asc")
    Iterable<VeiculoEntity> findAllOrderById();
    Iterable<VeiculoEntity> findAllByConcessionariaId(int id);
    Iterable<VeiculoEntity> findByDisponivel(String disponivel);
}
