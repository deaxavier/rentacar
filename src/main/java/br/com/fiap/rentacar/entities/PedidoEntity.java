package br.com.fiap.rentacar.entities;
import javax.persistence.*;
import java.util.Date;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBL_PEDIDO")
public class PedidoEntity {
    @Id
    @Column(name = "ID_PEDIDO", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PEDIDO")
    @SequenceGenerator(name = "SEQ_PEDIDO", sequenceName = "SEQ_PEDIDO", allocationSize = 1)
    private int id;

    @Column(name = "ID_VEICULO", nullable = false, columnDefinition = "int")
    private int veiculoId;

    @Column(name = "ID_CLIENTE", nullable = false, columnDefinition = "int")
    private int clienteId;

    @Column(name = "DT_PEDIDO", nullable = false, columnDefinition = "TIMESTAMP")
    private Date dataPedido;

    @Column(name = "INT_QTD_DIAS_SOLICITADO", nullable = false, columnDefinition = "int")
    private int quantidadeDiasSolicitado;

    @Column(name = "DT_DEVOLUCAO_ESTIMADA", nullable = false, columnDefinition = "TIMESTAMP")
    private Date dataDevolucaoEstimada;

    @Column(name = "INT_QTD_DIAS_REALIZADO", columnDefinition = "int")
    private int quantidadeDiasRealizado;

    @Column(name = "DT_DEVOLUCAO_REALIZADO", columnDefinition = "TIMESTAMP")
    private Date dataDevolucaoRealizada;

    @Column(name = "VL_PEDIDO_ESTIMADO", nullable = false, columnDefinition = "number(10,2)")
    private double valorPedidoEstimado;

    @Column(name = "VL_PEDIDO", columnDefinition = "number(10,2)")
    private double valorPedido;

    @ManyToOne(targetEntity = VeiculoEntity.class)
    @JoinColumn(name = "ID_VEICULO", referencedColumnName = "ID_VEICULO", insertable = false, updatable = false)
    private VeiculoEntity veiculo;

    @ManyToOne(targetEntity = ClienteEntity.class)
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE", insertable = false, updatable = false)
    private ClienteEntity cliente;
}
