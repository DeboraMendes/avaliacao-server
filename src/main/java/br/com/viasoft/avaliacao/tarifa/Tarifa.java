package br.com.viasoft.avaliacao.tarifa;

import br.com.viasoft.avaliacao.tipoOnibus.TipoOnibus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name="tarifa")
@NoArgsConstructor
@Data
public class Tarifa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PARTIDA")
    @NotNull
    private LocalTime partida;

    @Column(name = "VALOR")
    @NotNull
    private Double valor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_TIPO_ONIBUS", referencedColumnName = "id")
    @NotNull
    private TipoOnibus tipoOnibus;
}
