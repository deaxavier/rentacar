package br.com.fiap.rentacar.services.interfaces;

import br.com.fiap.rentacar.entities.ModeloEntity;

public interface ModeloService {
    ModeloEntity findById(int id);
    ModeloEntity save(ModeloEntity modelo);
    Iterable<ModeloEntity> findAllByMarcaId(int marcaId);
    Iterable<ModeloEntity> findAll();
}
