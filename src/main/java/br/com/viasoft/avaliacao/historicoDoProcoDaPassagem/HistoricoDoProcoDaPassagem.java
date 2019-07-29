package br.com.viasoft.avaliacao.historicoDoProcoDaPassagem;

import br.com.viasoft.avaliacao.usuario.Usuario;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "historico_do_proco_da_passagem")
@NoArgsConstructor
@Data
public class HistoricoDoProcoDaPassagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRECO")
    private Double preco;

    @Column(name = "DATA_DA_ALTERACAO")
    private LocalDate data;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
    private Usuario usuario;

}
