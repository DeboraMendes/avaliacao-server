package br.com.viasoft.avaliacao.model;

//import br.com.caelum.vraptor.serialization.SkipSerialization;
//import com.google.gson.annotations.Expose;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "empresa")
@Data
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String findAll = "Empresa.findAll";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 80, nullable = false)
    private String nomeFantasia;

    @Column(length = 80, nullable = false)
    private String razaoSocial;
//
//    @SkipSerialization
//    @Expose(serialize = false)
    @Column(nullable = true)
    private String caminhoFoto;
    
    public Empresa() {
        super();
    }

    public Empresa(String nomeFantasia, String razaoSocial) {
        super();
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
    }
    
    public Empresa(String nomeFantasia, String razaoSocial, String caminhoFoto) {
        super();
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.caminhoFoto = caminhoFoto;
    }

}
