package br.com.fiap.rentacar.services;

import br.com.fiap.rentacar.entities.ClienteEntity;
import br.com.fiap.rentacar.entities.ConcessionariaEntity;
import br.com.fiap.rentacar.repositories.interfaces.ClienteRepository;
import br.com.fiap.rentacar.repositories.interfaces.ConcessionariaRepository;
import br.com.fiap.rentacar.services.interfaces.ClienteService;
import br.com.fiap.rentacar.services.interfaces.ConcessionariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConcessionariaServiceImpl implements ConcessionariaService {
    private final ConcessionariaRepository concessionariaRepository;

    @Autowired
    public ConcessionariaServiceImpl(ConcessionariaRepository concessionariaRepository) {
        this.concessionariaRepository = concessionariaRepository;
    }

    public ConcessionariaEntity findById(int id) {
        return concessionariaRepository.findById(id).orElse(null);
    }

    public Iterable<ConcessionariaEntity> findAll() {
        return concessionariaRepository.findAll();
    }

    public ConcessionariaEntity save(ConcessionariaEntity concessionaria) {
        return concessionariaRepository.save(concessionaria);
    }
}
