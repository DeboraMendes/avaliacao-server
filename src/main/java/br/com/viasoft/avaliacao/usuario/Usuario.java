package br.com.viasoft.avaliacao.usuario;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
@Data
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    @NotNull
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    //    @SkipSerialization
    @Column(name = "SENHA")
    private String senha;

    @Column(name = "TELEFONE")
    private String telefone;

}
