package br.com.viasoft.avaliacao.estado;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="estado")
@NoArgsConstructor
@Data
public class Estado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CODIGO_IBGE")
    @NotNull
    private Integer codigoIbge;

    @Column(name = "NOME")
    @NotNull
    private String nome;

    @Column(name = "SIGLA")
    @NotNull
    private String sigla;
}
