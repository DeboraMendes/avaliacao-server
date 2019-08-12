package br.com.viasoft.avaliacao.ponto;

//import br.com.caelum.vraptor.serialization.SkipSerialization;

import br.com.viasoft.avaliacao.tipoPonto.TipoPonto;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "ponto")
@Data
public class Ponto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LATITUDE")
    @NotNull
    private Double latitude;

    @Column(name = "LONGITUDE")
    @NotNull
    private Double longitude;

    @Column(name = "NOME")
    @NotNull
    private String nome;

    @Column(name = "DESCRICAO")
    @NotNull
    private String descricao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_TIPO_PONTO", referencedColumnName = "ID")
    @NotNull
    private TipoPonto tipoPonto;;

    //    @SkipSerialization
    @Column(name = "CAMINHO_FOTO")
    private String caminhoFoto;

}
