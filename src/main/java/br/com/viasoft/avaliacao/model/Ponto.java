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

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    @Column(length = 80, nullable = false)
    private String nome;

    @Column(length = 500, nullable = false)
    private String descricao;
    
    @Column(nullable = true)
    private Boolean parada;
    
    @Column(nullable = true)
    private Boolean referencia;
    
//    @SkipSerialization
    @Column(nullable = true)
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
        this. caminhoFoto = caminhoFoto;
    }

}
