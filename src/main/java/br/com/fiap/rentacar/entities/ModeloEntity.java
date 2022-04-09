package br.com.fiap.rentacar.entities;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBL_MODELO")
public class ModeloEntity {
    @Id
    @Column(name = "ID_MODELO", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MODELO")
    @SequenceGenerator(name = "SEQ_MODELO", sequenceName = "SEQ_MODELO", allocationSize = 1)
    private int id;

    @Column(name = "ID_MARCA", nullable = false, columnDefinition = "int")
    private int marcaId;

    @Column(name = "NM_MODELO", nullable = false, columnDefinition = "varchar2(50)")
    private String nome;
}