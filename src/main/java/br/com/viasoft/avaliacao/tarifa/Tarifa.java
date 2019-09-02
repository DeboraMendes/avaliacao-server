package br.com.viasoft.avaliacao.tarifa;

import br.com.viasoft.avaliacao.passagem.Passagem;
import br.com.viasoft.avaliacao.tipoOnibus.TipoOnibus;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Table(name="tarifa")
@NoArgsConstructor
//@Data
@Getter
@Setter
public class Tarifa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PARTIDA")
    @NotNull
    @JsonFormat(pattern = "HH:mm")
    private LocalTime partida;

    @Column(name = "VALOR")
    @NotNull
    private Double valor;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_ONIBUS", referencedColumnName = "id")
    @NotNull
    private TipoOnibus tipoOnibus;

    @Column(name = "TEMPO_VIAJEM")
    @NotNull
    @JsonFormat(pattern = "HH:mm")
    private LocalTime tempoViajem;
}
