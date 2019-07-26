package br.com.viasoft.avaliacao.ponto;

import br.com.viasoft.avaliacao.crud.CrudService;
import br.com.viasoft.avaliacao.ponto.Ponto;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

public interface PontoService extends CrudService<Ponto, Long> {

    @Entity(name = "usuario")
    @Data
    class Usuario implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "NOME")
        private String nome;

        @Column(name = "EMAIL")
        private String email;

        //    @SkipSerialization
        @Column(name = "SENHA")
        private String senha;
    }
}
