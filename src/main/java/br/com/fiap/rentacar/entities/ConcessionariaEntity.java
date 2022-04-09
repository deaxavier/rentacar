package br.com.fiap.rentacar.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBL_CONCESSIONARIA")
public class ConcessionariaEntity {
    @Id
    @Column(name = "ID_CONCESSIONARIA", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONCESSIONARIA")
    @SequenceGenerator(name = "SEQ_CONCESSIONARIA", sequenceName = "SEQ_CONCESSIONARIA", allocationSize = 1)
    private int id;

    @Column(name = "NM_CONCESSIONARIA", nullable = false, columnDefinition = "varchar2(50)")
    private String nome;

    @Column(name = "DS_TELEFONE", nullable = false, columnDefinition = "varchar2(50)")
    private String telefone;

    @Column(name = "DS_ENDERECO", nullable = false, columnDefinition = "varchar2(50)")
    private String endereco;

    @Column(name = "NM_ENDERECO", nullable = false, columnDefinition = "int")
    private int numeroCasa;

    @Column(name = "CMPL_ENDERECO", nullable = false, columnDefinition = "varchar(50)")
    private String complemento;

    @Column(name = "DS_BAIRRO", nullable = false, columnDefinition = "varchar2(50)")
    private String bairro;

    @Column(name = "DS_CIDADE", nullable = false, columnDefinition = "varchar2(50)")
    private String cidade;

    @Column(name = "DS_ESTADO", nullable = false, columnDefinition = "varchar2(50)")
    private String estado;

    @Column(name = "DS_PAIS", nullable = false, columnDefinition = "varchar2(50)")
    private String pais;

    @Column(name = "CEP", nullable = false, columnDefinition = "varchar2(10)")
    private String cep;
}