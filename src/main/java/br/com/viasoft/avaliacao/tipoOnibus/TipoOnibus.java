package br.com.viasoft.avaliacao.tipoOnibus;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="tipo_onibus")
@NoArgsConstructor
@Data
public class TipoOnibus implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO")
    @NotNull
    private String descricao;

}
