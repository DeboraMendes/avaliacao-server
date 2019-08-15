package br.com.viasoft.avaliacao.empresa;

import br.com.viasoft.avaliacao.endereco.Endereco;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;

@Entity
@Table(name = "empresa")
@NoArgsConstructor
@Data
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    @NotNull
    private String nome;

    @Column(name = "EMAIL")
    @Email
    private String email;

    @Column(name = "TELEFONE")
    private String telefone;

    @OneToOne
    @JoinColumn(name = "ID_ENDERECO")
    private Endereco endereco;
}
