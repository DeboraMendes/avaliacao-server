package br.com.viasoft.avaliacao.passagem;

import br.com.viasoft.avaliacao.cidade.Cidade;
import br.com.viasoft.avaliacao.diasDaSemana.DiaDaSemana;
import br.com.viasoft.avaliacao.empresa.Empresa;
import br.com.viasoft.avaliacao.tarifa.Tarifa;
import com.fasterxml.jackson.annotation.*;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
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

    //permitir que Jackson lide melhor com a relação (no caso de relacionamentos bidirecionais):
    // @JsonManagedReference (origem) e @JsonBackReference (vinculo)
    @JsonManagedReference
    @OneToMany(mappedBy = "passagem", fetch = FetchType.LAZY, cascade=CascadeType.ALL, orphanRemoval = true)
    private List<DiaDaSemana> diasDaSemana = new ArrayList<>();

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CIDADE_ORIGEM", referencedColumnName = "id")
    @NotNull
    private Cidade origem;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CIDADE_DESTINO", referencedColumnName = "id")
    @NotNull
    private Cidade destino;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "ID_TARIFA")
    private Tarifa tarifa;
}
