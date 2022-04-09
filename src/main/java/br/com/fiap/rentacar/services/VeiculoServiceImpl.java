package br.com.fiap.rentacar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.fiap.rentacar.entities.VeiculoEntity;
import br.com.fiap.rentacar.repositories.interfaces.PedidoRepository;
import br.com.fiap.rentacar.repositories.interfaces.VeiculoRepository;
import br.com.fiap.rentacar.services.interfaces.VeiculoService;

@Service
public class VeiculoServiceImpl implements VeiculoService {
    public final VeiculoRepository veiculoRepository;
    public final PedidoRepository pedidoRepository;

    @Autowired
    public VeiculoServiceImpl(VeiculoRepository veiculoRepository, PedidoRepository pedidoRepository) {
        this.veiculoRepository = veiculoRepository;
        this.pedidoRepository = pedidoRepository;
    }

    public void Devolver(int id, int concessionariaId) {
        try {
            var veiculo = this.veiculoRepository.findById(id).orElse(null);

            if (veiculo == null) {
                throw new RuntimeException("Veiculo não encontrado");
            }
            veiculo.setDisponivel("Y");
            veiculo.setConcessionariaId(concessionariaId);
            veiculoRepository.save(veiculo);

            var pedido = pedidoRepository.findByVeiculoIdAndDataDevolucaoRealizadaIsNull(id);
            pedido.setDataDevolucaoRealizada(new java.util.Date());
            var dataDevolucao = pedido.getDataDevolucaoRealizada();
            var dataPedido = pedido.getDataPedido();

            long dias = (dataDevolucao.getTime() - dataPedido.getTime()) / (1000 * 60 * 60 * 24) + 1;
            pedido.setValorPedido(dias * veiculo.getValorDiaria());
            pedido.setQuantidadeDiasRealizado((int) dias);
            pedidoRepository.save(pedido);

        } catch (Exception e) {
            throw new RuntimeException("Problema ao devolver o veiculo");
        }

    }

    public Iterable<VeiculoEntity> findAll() {
        return veiculoRepository.findAllOrderById();
    }

    public Iterable<VeiculoEntity> findByConcessionariaId(int id) {
        return veiculoRepository.findAllByConcessionariaId(id);
    }

    public Iterable<VeiculoEntity> findByDisponivel(String disponivel) {
        return veiculoRepository.findByDisponivel(disponivel);
    }

    public VeiculoEntity findById(int id) {
        return veiculoRepository.findById(id).orElse(null);
    }

    public VeiculoEntity save(VeiculoEntity veiculo) {
        return veiculoRepository.save(veiculo);
    }

}
