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
    @Size(min=3, max = 800, message = "NOME da EMPRESA deve possuir no mínimo 3 caracteres e no máximo 800 caracteres.")
    private String nome;

    @Column(name = "EMAIL")
    @Email(message = "EMAIL da EMPRESA é inválido.")
    private String email;

    @Column(name = "TELEFONE")
    @Pattern(regexp="(^$|[0-9]{11})", message = "TELEFONE da EMPRESA inválido.")
    private String telefone;

    @OneToOne
    @JoinColumn(name = "ID_ENDERECO")
    private Endereco endereco;
}
