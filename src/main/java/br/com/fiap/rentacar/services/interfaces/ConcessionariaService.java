package br.com.fiap.rentacar.services.interfaces;

import br.com.fiap.rentacar.entities.ConcessionariaEntity;

public interface ConcessionariaService {
    ConcessionariaEntity findById(int id);
    Iterable<ConcessionariaEntity> findAll();
    ConcessionariaEntity save(ConcessionariaEntity concessionaria);
}
