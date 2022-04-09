package br.com.fiap.rentacar.entities;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBL_VEICULO")
public class VeiculoEntity {
    @Id
    @Column(name = "ID_VEICULO", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VEICULO")
    @SequenceGenerator(name = "SEQ_VEICULO", sequenceName = "SEQ_VEICULO", allocationSize = 1)
    private int id;

    @Column(name = "ID_CONCESSIONARIA", nullable = false, columnDefinition = "int")
    private int concessionariaId;

    @Column(name = "ID_MODELO", nullable = false, columnDefinition = "int")
    private int modeloId;

    @Column(name = "DSC_PLACA", nullable = false, columnDefinition = "varchar2(8)")
    private String placa;

    @Column(name = "DS_COR", nullable = false, columnDefinition = "varchar2(100)")
    private String cor;

    @Column(name = "DS_OPCIONAIS", nullable = true, columnDefinition = "varchar2(100)")
    private String opcionais;

    @Column(name = "DS_ANO", nullable = false, columnDefinition = "varchar2(4)")
    private String ano;

    @Column(name = "DS_ANOFABRICACAO", nullable = false, columnDefinition = "varchar2(4)")
    private String anoFabricacao;

    @Column(name = "DS_CHASSI", nullable = false, columnDefinition = "varchar2(50)")
    private String chassi;

    @Column(name = "DS_RENAVAM", nullable = false, columnDefinition = "varchar2(50)")
    private String renavam;

    @Column(name = "DS_KM", nullable = false, columnDefinition = "int")
    private int km;

    @Column(name = "CUR_VALOR_DIARIA", nullable = false, columnDefinition = "number(10,2)")
    private float valorDiaria;

    @Column(name = "DS_DISPONIVEL", nullable = false, columnDefinition = "char(1)")
    private String disponivel;

    @ManyToOne(targetEntity = ConcessionariaEntity.class)
    @JoinColumn(name = "ID_CONCESSIONARIA", referencedColumnName = "ID_CONCESSIONARIA", insertable = false, updatable = false)
    private ConcessionariaEntity concessionaria;
}