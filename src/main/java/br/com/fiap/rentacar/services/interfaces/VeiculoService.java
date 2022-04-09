package br.com.fiap.rentacar.services.interfaces;

import br.com.fiap.rentacar.entities.VeiculoEntity;

public interface VeiculoService {
    void Devolver(int id, int concessionariaId);
    Iterable<VeiculoEntity> findAll();
    Iterable<VeiculoEntity> findByConcessionariaId(int id);
    Iterable<VeiculoEntity> findByDisponivel(String disponivel);
    VeiculoEntity findById(int id);
    VeiculoEntity save(VeiculoEntity veiculo);
}
