package br.com.fiap.rentacar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fiap.rentacar.entities.MarcaEntity;
import br.com.fiap.rentacar.repositories.interfaces.MarcaRepository;
import br.com.fiap.rentacar.services.interfaces.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService {
    private final MarcaRepository marcaRepository;

    @Autowired
    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public Iterable<MarcaEntity> findAll() {
        return marcaRepository.findAllOrderByNome();
    }

    public MarcaEntity findById(int id) {
        return marcaRepository.findById(id).orElse(null);
    }

    public MarcaEntity save(MarcaEntity marca) {
        return marcaRepository.save(marca);
    }

}
