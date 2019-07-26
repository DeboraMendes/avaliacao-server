package br.com.viasoft.avaliacao.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

//@Entity é uma anotação do JPA. É utilizada para fazer o mapeamento entre entre dados e objetos, ou seja, utilizada para informar que uma classe também é uma entidade.
@Entity
//@Table é uma anotação do JPA. Permite que você especifique os detalhes da tabela que será usada para persistir a entidade no banco de dados. Nesse caso, está sendo especificado somente o nome da tabela
@Table(name = "empresa")
//@NoArgsConstructor é uma anotação do Lombok. Irá gerar um construtor sem parâmetros.
@NoArgsConstructor
//@Data é uma anotação do Lombok. É atalho para @ToString, @EqualsAndHashCode, @Getters,  @Setters e @RequiredArgsConstructor
@Data
//Serializable é uma Interface do Java. Serializar um objeto significa transformá-lo em um stream de bytes que pode ser gravado ou transmitido. Usa-se serialização quando se quer gravar objetos em arquivos ou transmiti-los pela rede por exemplo.
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomeFantasia;

    @Column
    private String razaoSocial;

    @Column
    private String caminhoFoto;
}
