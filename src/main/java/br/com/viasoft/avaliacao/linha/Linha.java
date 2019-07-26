package br.com.viasoft.avaliacao.linha;

import br.com.viasoft.avaliacao.empresa.Empresa;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "linha")
@Data
public class Linha implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_EMPRESA", referencedColumnName = "ID")
    private Empresa empresa;

    @Column(name = "DESCRICAO")
    private String descricao;

}








