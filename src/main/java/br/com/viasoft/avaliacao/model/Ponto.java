package br.com.viasoft.avaliacao.model;

//import br.com.caelum.vraptor.serialization.SkipSerialization;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ponto")
@Data
public class Ponto implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String findAll = "Ponto.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double latitude;

    @Column
    private Double longitude;

    @Column
    private String nome;

    @Column
    private String descricao;

    @Column
    private Boolean parada;

    @Column
    private Boolean referencia;

    //    @SkipSerialization
    @Column
    private String caminhoFoto;

    public Ponto() {
        super();
    }

    public Ponto(Double latitude, Double longitude, String nome, String descricao, Boolean parada, Boolean referencia) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
        this.nome = nome;
        this.descricao = descricao;
        this.parada = parada;
        this.referencia = referencia;
    }

    public Ponto(Double latitude, Double longitude, String nome, String descricao, Boolean parada, Boolean referencia, String caminhoFoto) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
        this.nome = nome;
        this.descricao = descricao;
        this.parada = parada;
        this.referencia = referencia;
        this.caminhoFoto = caminhoFoto;
    }

}
