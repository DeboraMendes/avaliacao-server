package br.com.viasoft.avaliacao.historicoDoProcoDaPassagem;

import br.com.viasoft.avaliacao.empresa.Empresa;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "historico_do_preco_da_passagem")
@NoArgsConstructor
//@Data
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
        property  = "id",
        scope     = Long.class)
public class HistoricoDoProcoDaPassagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRECO")
    @NotNull
    private Double preco;

    @Column(name = "DATA_DA_ALTERACAO")
    private LocalDate data;

    //@JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "ID_EMPRESA")
    private Empresa empresa;

}
