package br.com.viasoft.avaliacao.tarifa;

import br.com.viasoft.avaliacao.tipoOnibus.TipoOnibus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
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
    @JsonFormat(pattern = "HH:mm")
    private LocalTime partida;

    @Column(name = "VALOR")
    @NotNull(message = "VALOR da TARIFA é obrigatório.")
    @DecimalMin(value = "0.01", message = "VALOR da TARIFA deve ser no mínimo 0.01 centavo.")
    @DecimalMax(value = "50000", message = "VALOR da TARIFA deve ser no máximo 50000 reais.")
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_ONIBUS", referencedColumnName = "id")
    @NotNull
    private TipoOnibus tipoOnibus;

    @Column(name = "TEMPO_VIAJEM")
    private String tempoViajem;

}
