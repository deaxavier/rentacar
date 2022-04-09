package br.com.fiap.rentacar.repositories.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import br.com.fiap.rentacar.entities.ModeloEntity;

@Repository
public interface ModeloRepository extends CrudRepository<ModeloEntity, Integer> {
    @Query("select m from ModeloEntity m order by m.nome")
    Iterable<ModeloEntity> findAllOrderByNome();

    Iterable<ModeloEntity> findAllByMarcaId(int id);
}
