package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.cidade.Cidade;
import br.com.viasoft.avaliacao.empresa.Empresa;
import br.com.viasoft.avaliacao.horariosETarifas.passagem.HorariosETarifas;
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
@Table(name="passagem")
@NoArgsConstructor
@Data
public class Passagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "id")
    @NotNull
    private Empresa empresa;

    @Column(name = "DIA_DA_SEMANA")
    @ElementCollection(targetClass=LocalDate.class)
    @NotNull
    private List<LocalDate> diaDaSemana = new ArrayList<>();

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CIDADE_ORIGEM", referencedColumnName = "id")
    @NotNull
    private Cidade origem;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CIDADE_DESTINO", referencedColumnName = "id")
    @NotNull
    private Cidade destino;

    @OneToMany(mappedBy = "passagem", cascade=CascadeType.ALL)
    private List<Tarifa> tarifas = new ArrayList<Tarifa>();

}
