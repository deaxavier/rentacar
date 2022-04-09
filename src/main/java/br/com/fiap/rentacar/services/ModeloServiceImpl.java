package br.com.fiap.rentacar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fiap.rentacar.entities.ModeloEntity;
import br.com.fiap.rentacar.repositories.interfaces.ModeloRepository;
import br.com.fiap.rentacar.services.interfaces.ModeloService;

@Service
public class ModeloServiceImpl implements ModeloService {
    private ModeloRepository modeloRepository;

    @Autowired
    public ModeloServiceImpl(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    public ModeloEntity findById(int id) {
        return modeloRepository.findById(id).orElse(null);
    }

    public ModeloEntity save(ModeloEntity modelo) {
        return modeloRepository.save(modelo);
    }


    public Iterable<ModeloEntity> findAllByMarcaId(int marcaId) {
        return modeloRepository.findAllByMarcaId(marcaId);
    }

    public Iterable<ModeloEntity> findAll() {
        return modeloRepository.findAllOrderByNome();
    }

}