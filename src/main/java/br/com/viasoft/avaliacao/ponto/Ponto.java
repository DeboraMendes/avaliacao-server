package br.com.viasoft.avaliacao.ponto;

//import br.com.caelum.vraptor.serialization.SkipSerialization;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ponto")
@Data
public class Ponto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "LATITUDE")
    private Double latitude;

    @Column(name = "LONGITUDE")
    private Double longitude;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "PARADA")
    private Boolean parada;

    @Column(name = "REFERENCIA")
    private Boolean referencia;

    //    @SkipSerialization
    @Column(name = "CAMINHO_FOTO")
    private String caminhoFoto;

}
