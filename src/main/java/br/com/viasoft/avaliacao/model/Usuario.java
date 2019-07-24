package br.com.viasoft.avaliacao.model;

//import br.com.caelum.vraptor.serialization.SkipSerialization;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NamedQueries({
    @NamedQuery(name = "Usuario.findByEmailSenha",
            query = "SELECT u "
                    + "FROM Usuario u "
                    + "WHERE u.email=:email AND "
                    + "u.senha=:senha")
})

@Data
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    public static final String findByEmailSenha = "Usuario.findByEmailSenha";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nome;

    @Column(length = 100, nullable = false)
    private String email;

//    @SkipSerialization
    @Column(length = 100, nullable = false)
    private String senha;

    public Usuario() {
    }

}
