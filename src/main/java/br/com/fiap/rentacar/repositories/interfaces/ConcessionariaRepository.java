package br.com.fiap.rentacar.repositories.interfaces;

import br.com.fiap.rentacar.entities.ConcessionariaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConcessionariaRepository extends CrudRepository<ConcessionariaEntity, Integer> {
}
