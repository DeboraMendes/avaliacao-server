package br.com.viasoft.avaliacao.horariosETarifas.passagem;

import br.com.viasoft.avaliacao.passagem.Passagem;
import br.com.viasoft.avaliacao.tarifa.Tarifa;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="horarios_tarifas")
@NoArgsConstructor
@Data
public class HorariosETarifas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "ID_PASSAGEM", referencedColumnName = "id")
//    @NotNull
//    private Passagem passagem;
//
//    @ManyToOne
//    @JoinColumn(name = "ID_TARIFA", referencedColumnName = "id")
//    @NotNull
//    private Tarifa tarifa;
}
