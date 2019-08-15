package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.cidade.Cidade;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="passagem")
@NoArgsConstructor
@Data
public class Passagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DIA_DA_SEMANA")
    @NotNull
    private List<DayOfWeek> diaDaSemana = new ArrayList<>();

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CIDADE_ORIGEM", referencedColumnName = "id")
    @NotNull
    private Cidade origem;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CIDADE_DESTINO", referencedColumnName = "id")
    @NotNull
    private Cidade destino;

    @Column(name = "PARTIDA")
    private LocalTime partida;

    @Column(name = "VALOR")
    @NotNull
    private Double valor;
}
