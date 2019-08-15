package br.com.viasoft.avaliacao.empresa;

import br.com.viasoft.avaliacao.endereco.Endereco;
import br.com.viasoft.avaliacao.historicoDoProcoDaPassagem.HistoricoDoProcoDaPassagem;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table é uma anotação do JPA. Permite que você especifique os detalhes da tabela que será usada para persistir a entidade no banco de dados. Nesse caso, está sendo especificado somente o nome da tabela
@Table(name = "empresa")
//@NoArgsConstructor é uma anotação do Lombok. Irá gerar um construtor sem parâmetros.
@NoArgsConstructor
//@Data é uma anotação do Lombok. É atalho para @ToString, @EqualsAndHashCode, @Getters,  @Setters e @RequiredArgsConstructor
//@Data
@Getter
@Setter
//Serializable é uma Interface do Java. Serializar um objeto significa transformá-lo em um stream de bytes que pode ser gravado ou transmitido. Usa-se serialização quando se quer gravar objetos em arquivos ou transmiti-los pela rede por exemplo.
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property  = "id",
        scope     = Long.class)
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME_FANTASIA")
    @NotNull
    //@Min(3)
    //@Max(800)
    private String nomeFantasia;

    @Column(name = "RAZAO_SOCIAL")
    @NotNull
    //@Min(3)
    //@Max(800)
    private String razaoSocial;

    @Column(name = "EMAIL")
    @Email
    private String email;

    @Column(name = "TELEFONE")
    private String telefone;

    @OneToOne
    @JoinColumn(name = "ID_ENDERECO")
    private Endereco endereco;

   // @JsonBackReference
    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY)
    private List<HistoricoDoProcoDaPassagem> historicoDoProcoDaPassagem = new ArrayList<>();
}
