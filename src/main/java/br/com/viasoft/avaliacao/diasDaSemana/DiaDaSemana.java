package br.com.viasoft.avaliacao.diasDaSemana;

import br.com.viasoft.avaliacao.passagem.Passagem;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="dia_da_semana")
@NoArgsConstructor
@Data
public class DiaDaSemana implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO")
    @NotNull
    private String descricao;

    //permitir que Jackson lide melhor com a relação (no caso de relacionamentos bidirecionais):
    // @JsonManagedReference (origem) e @JsonBackReference (vinculo)
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "ID_PASSAGEM")
    private Passagem passagem;

}
