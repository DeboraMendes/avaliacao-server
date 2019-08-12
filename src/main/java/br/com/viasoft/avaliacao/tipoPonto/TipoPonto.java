package br.com.viasoft.avaliacao.tipoPonto;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "tipo_ponto")
@Data
public class TipoPonto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO")
    @NotNull
    private String descricao;

}
