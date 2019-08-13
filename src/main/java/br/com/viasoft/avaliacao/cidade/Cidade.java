package br.com.viasoft.avaliacao.cidade;

import br.com.viasoft.avaliacao.estado.Estado;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="cidade")
@NoArgsConstructor
@Data
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    @NotNull
    private String nome;

    @ManyToOne
    @JoinColumn(name = "ID_ESTADO", referencedColumnName = "id")
    @NotNull
    private Estado estado;
}
