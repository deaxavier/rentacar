package br.com.fiap.rentacar.services.interfaces;

import br.com.fiap.rentacar.entities.MarcaEntity;

public interface MarcaService {
    Iterable<MarcaEntity> findAll();

    MarcaEntity findById(int id);

    MarcaEntity save(MarcaEntity marca);

}
