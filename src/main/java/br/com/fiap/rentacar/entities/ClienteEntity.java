package br.com.fiap.rentacar.entities;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBL_CLIENTE")
public class ClienteEntity {
    @Id
    @Column(name = "ID_CLIENTE", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CLIENTE")
    @SequenceGenerator(name = "SEQ_CLIENTE", sequenceName = "SEQ_CLIENTE", allocationSize = 1)
    private int id;

    @Column(name = "NM_CLIENTE", nullable = false, columnDefinition = "varchar2(50)")
    private String nome;

    @Column(name = "DS_EMAIL", nullable = false, columnDefinition = "varchar2(50)", unique = true)
    private String email;

    @Column(name = "DS_TELEFONE", nullable = false, columnDefinition = "varchar2(50)")
    private String telefone;

    @Column(name = "CPF_CLIENTE", nullable = false, columnDefinition = "varchar2(50)", unique = true)
    private String cpf;

    @Column(name = "RG_CLIENTE", nullable = false, columnDefinition = "varchar2(50)")
    private String rg;

    @Column(name = "CNH_CLIENTE", nullable = false, columnDefinition = "varchar2(50)")
    private String habilitacao;

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