package br.com.fiap.rentacar.repositories.interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import br.com.fiap.rentacar.entities.ClienteEntity;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteEntity, Integer> {
    @Query("select c from ClienteEntity c order by c.nome")
    Iterable<ClienteEntity> findAllOrderByNome();
    ClienteEntity findByCpf(String cpf);
    ClienteEntity findByEmail(String email);
}
