package br.com.viasoft.avaliacao.diasDaSemana;

import br.com.viasoft.avaliacao.passagem.Passagem;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="dia_da_semana")
@AllArgsConstructor
@NoArgsConstructor
//@Data
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiaDaSemana implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO")
    @NotNull
    private String descricao;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "ID_PASSAGEM")
    private Passagem passagem;

}
