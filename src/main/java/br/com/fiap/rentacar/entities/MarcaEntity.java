package br.com.fiap.rentacar.entities;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBL_MARCA")
public class MarcaEntity {
    @Id
    @Column(name = "ID_MARCA", nullable = false, unique = true, columnDefinition = "int")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MARCA")
    @SequenceGenerator(name = "SEQ_MARCA", sequenceName = "SEQ_MARCA", allocationSize = 1)
    private int id;

    @Column(name = "NM_MARCA", nullable = false, columnDefinition = "varchar2(50)")
    private String nome;

}