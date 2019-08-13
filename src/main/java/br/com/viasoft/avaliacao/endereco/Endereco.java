package br.com.viasoft.avaliacao.endereco;

import br.com.viasoft.avaliacao.cidade.Cidade;
import br.com.viasoft.avaliacao.empresa.Empresa;
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
    private String numero;

    @Column(name = "BAIRRO")
    @NotNull
    private String bairro;

    @Column(name = "CEP")
    @NotNull
    private String cep;

    @Column(name = "COMPLEMENTO")
    @NotNull
    private String complemento;

    @ManyToOne
    @JoinColumn(name = "ID_CIDADE", referencedColumnName = "id")
    private Cidade cidade;

    @OneToOne(optional = false)
    @MapsId
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "id")
    private Empresa empresa;
}
