package br.com.viasoft.avaliacao.cidade;

import br.com.viasoft.avaliacao.estado.Estado;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @Size(min=3, max = 800, message = "NOME da CIDADE deve possuir no mínimo 3 caracteres e no máximo 800 caracteres.")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "ID_ESTADO", referencedColumnName = "id")
    @NotNull
    private Estado estado;
}
