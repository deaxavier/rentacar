package br.com.fiap.rentacar.services.interfaces;

import br.com.fiap.rentacar.entities.ClienteEntity;

public interface ClienteService {
    ClienteEntity findById(int id);
    ClienteEntity findByEmail(String email);
    Iterable<ClienteEntity> findAll();
    ClienteEntity save(ClienteEntity cliente);
    ClienteEntity findByCpf(String cpf);
}
