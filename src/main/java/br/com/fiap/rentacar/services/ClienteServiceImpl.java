package br.com.fiap.rentacar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fiap.rentacar.entities.ClienteEntity;
import br.com.fiap.rentacar.repositories.interfaces.ClienteRepository;
import br.com.fiap.rentacar.services.interfaces.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public ClienteEntity findById(int id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public ClienteEntity findByEmail(String email) {
        return clienteRepository.findByEmail(email);
    }

    public Iterable<ClienteEntity> findAll() {
        return clienteRepository.findAllOrderByNome();
    }

    public ClienteEntity save(ClienteEntity cliente) {
        return clienteRepository.save(cliente);
    }

    public ClienteEntity findByCpf(String cpf) {
        return clienteRepository.findByCpf(cpf);
    }
}
