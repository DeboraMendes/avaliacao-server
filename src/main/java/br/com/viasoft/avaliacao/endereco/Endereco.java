package br.com.viasoft.avaliacao.endereco;

import br.com.viasoft.avaliacao.cidade.Cidade;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="endereco")
@NoArgsConstructor
@Data
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "RUA")
    @NotNull
    private String rua;

    @Column(name = "NUMERO")
    @NotNull
    private Integer numero;

    @Column(name = "BAIRRO")
    @NotNull
    private String bairro;

    @Column(name = "CEP")
    @NotNull
    private String cep;

    @Column(name = "COMPLEMENTO")
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "ID_CIDADE", referencedColumnName = "id")
    @NotNull
    private Cidade cidade;

}
