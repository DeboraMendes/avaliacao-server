package br.com.viasoft.avaliacao.historicoDoProcoDaPassagem;

import br.com.viasoft.avaliacao.empresa.Empresa;
import br.com.viasoft.avaliacao.usuario.Usuario;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "historico_do_preco_da_passagem")
@NoArgsConstructor
@Data
public class HistoricoDoProcoDaPassagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRECO")
    @NotNull
    private Double preco;

    @Column(name = "DATA_DA_ALTERACAO")
    private LocalDate data;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_EMPRESA")
    private Empresa empresa;

}
