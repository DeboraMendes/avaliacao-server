package br.com.viasoft.avaliacao.horariosETarifas.passagem;

import br.com.viasoft.avaliacao.cidade.Cidade;
import br.com.viasoft.avaliacao.empresa.Empresa;
import br.com.viasoft.avaliacao.passagem.Passagem;
import br.com.viasoft.avaliacao.tarifa.Tarifa;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="horariosETarifas")
@NoArgsConstructor
@Data
public class HorariosETarifas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinColumn(name = "ID_PASSAGEM", referencedColumnName = "id")
    @NotNull
    private Passagem passagem;

    @ManyToMany
    @JoinColumn(name = "ID_TARIFA", referencedColumnName = "id")
    @NotNull
    private Tarifa tarifa;
}
