package br.com.fiap.rentacar.repositories.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import br.com.fiap.rentacar.entities.MarcaEntity;

@Repository
public interface MarcaRepository extends CrudRepository<MarcaEntity, Integer> {

    @Query("select m from MarcaEntity m order by m.nome")
    Iterable<MarcaEntity> findAllOrderByNome();
}
