package br.com.viasoft.avaliacao.estado;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @Min(value = 1, message = "CÓDIGO DO IBGE do ESTADO deve ser no mínimo 1.")
    @Max(value = 9999, message = "CÓDIGO DO IBGE do ESTADO deve ser no máximo 9999.")
    private Integer codigoIbge;

    @Column(name = "NOME")
    @NotNull
    @Size(min=3, max = 800, message = "NOME do ESTADO deve possuir no mínimo 3 caracteres e no máximo 800 caracteres.")
    private String nome;

    @Column(name = "SIGLA")
    @NotNull
    @Size(min=2, max = 2, message = "SIGLA do ESTADO deve possuir no mínimo 2 caracteres e no máximo 2 caracteres.")
    private String sigla;
}
